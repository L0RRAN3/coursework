public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 2000);
        employees[1] = new Employee("Петрова Мария Александровна", 2, 2500);
        employees[2] = new Employee("Сидоров Алексей Петрович", 3, 3000);
        employees[3] = new Employee("Козлова Екатерина Дмитриевна", 4, 3500);
        employees[4] = new Employee("Васильев Игорь Сергеевич", 5, 4000);

        System.out.println("Список всех сотрудников:");
        printAllEmployees();

        System.out.println("\nСумма затрат на зарплаты в месяц: " + calculateTotalSalary());

        System.out.println("\nСотрудник с минимальной зарплатой:");
        Employee minSalaryEmployee = findMinSalaryEmployee();
        System.out.println(minSalaryEmployee);

        System.out.println("\nСотрудник с максимальной зарплатой:");
        Employee maxSalaryEmployee = findMaxSalaryEmployee();
        System.out.println(maxSalaryEmployee);

        System.out.println("\nСреднее значение зарплат: " + calculateAverageSalary());

        System.out.println("\nФ. И. О. всех сотрудников:");
        printFullNameOfAllEmployees();
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalary() {
        double totalSalary = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }

        return totalSalary;
    }

    public static Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = null;

        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }

        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = null;

        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {

                    maxSalaryEmployee = employee;
                }
            }
        }

        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        int employeeCount = 0;
        double totalSalary = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                employeeCount++;
                totalSalary += employee.getSalary();
            }
        }

        return totalSalary / employeeCount;
    }

    public static void printFullNameOfAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
