public class EmployeeBook {
    private final Employee[] employees;
    private int size;


    public EmployeeBook(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (size >= employees.length) {
            return false;
        }
        employees[size] = employee;
        size++;
        return true;
    }

    public boolean removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    public Employee findEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }


    public Employee[] getAllEmployees() {
        Employee[] result = new Employee[size];
        System.arraycopy(employees, 0, result, 0, size);
        return result;
    }


    public double calculateTotalSalary() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public Employee findEmployeeWithMinSalary() {
        if (size == 0) return null;
        Employee minEmployee = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() < minEmployee.getSalary()) {
                minEmployee = employees[i];
            }
        }
        return minEmployee;
    }


    public Employee findEmployeeWithMaxSalary() {
        if (size == 0) return null;
        Employee maxEmployee = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employees[i];
            }
        }
        return maxEmployee;
    }

    public double calculateAverageSalary() {
        if (size == 0) return 0;
        return calculateTotalSalary() / size;
    }
}