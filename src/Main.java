public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook(10);


        employeeBook.addEmployee(new Employee(1, "Иван Иванов", 50000));
        employeeBook.addEmployee(new Employee(2, "Петр Петров", 60000));
        employeeBook.addEmployee(new Employee(3, "Борис Борисов", 55000));


        System.out.println("Список всех сотрудников:");
        for (Employee employee : employeeBook.getAllEmployees()) {
            System.out.println(employee);
        }


        System.out.println("Общая сумма зарплат: " + employeeBook.calculateTotalSalary());


        Employee minSalaryEmployee = employeeBook.findEmployeeWithMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);


        Employee maxSalaryEmployee = employeeBook.findEmployeeWithMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);


        System.out.println("Средняя зарплата: " + employeeBook.calculateAverageSalary());


        employeeBook.removeEmployee(2);
        System.out.println("Список сотрудников после удаления:");
        for (Employee employee : employeeBook.getAllEmployees()) {
            System.out.println(employee);
        }


        Employee foundEmployee = employeeBook.findEmployeeById(1);
        if (foundEmployee != null) {
            System.out.println("Найден сотрудник: " + foundEmployee);
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }
}