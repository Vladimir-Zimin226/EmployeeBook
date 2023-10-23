
public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов", "Иван", "Иванович", "Один", 99_000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", "Один", 100_000);
        employees[2] = new Employee("Сидоров", "Сидор", "Сидорович", "Два", 120_000);
        employees[3] = new Employee("Свиридов", "Свирид", "Свиридович", "Два", 120_000);
        employees[4] = new Employee("Павлов", "Павел", "Павлович", "Три", 140_000);
        employees[5] = new Employee("Егоров", "Егор", "Егорович", "Три", 152_000);
        employees[6] = new Employee("Александров", "Александр", "Александрович", "Три", 140_000);
        employees[7] = new Employee("Дмитриев", "Дмитрий", "Дмитриевич", "Четыре", 170_000);
        employees[8] = new Employee("Сергеев", "Сергей", "Сергеевич", "Четыре", 170_000);
        employees[9] = new Employee("Владимиров", "Владимир", "Владимирович", "Пять", 200_000);

        //printAllEmployees(employees);

        //calculationTotalSalary(employees);

        //findPoorEmployee(employees);

        //findReachEmployee(employees);

        //calculationAverageSalaryM1(employees);

        //calculationAverageSalaryM2(employees);

        //printEmployeesNSP(employees);

        //indexSalaries(employees);

        findPoorDepartamentEmployee(employees);

    }

    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int calculationTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + totalSalary + " руб.");
        return totalSalary;
    }

    public static void findPoorEmployee(Employee[] employees) {
        double minSalary = Double.MAX_VALUE;
        ;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника: " + minSalary + " руб.");
        for (int i = 0; i < employees.length; i++) {
            if (minSalary == employees[i].getSalary()) {
                System.out.println("Сотрудник: " + employees[i].getSurname() + " " + employees[i].getName());
            }
        }
    }

    public static void findReachEmployee(Employee[] employees) {
        double maxSalary = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная затрата сотрудника: " + maxSalary + " руб.");
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary == employees[i].getSalary()) {
                System.out.println("Сотрудник: " + employees[i].getSurname() + " " + employees[i].getName());
            }
        }
    }

    public static void calculationAverageSalaryM1(Employee[] employees) {
        int averageSalary = calculationTotalSalary(employees) / employees.length;
        System.out.println("Средняя зарплата в компании: " + averageSalary + " руб.");
    }

    public static void calculationAverageSalaryM2(Employee[] employees) {
        int averageSalary = 0;
        int totalSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getSalary();
        }
        averageSalary = totalSalary / employees.length;
        System.out.println("Средняя зарплата в компании: " + averageSalary + " руб.");
    }

    public static void printEmployeesNSP(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник: " + employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronimic());
        }
    }

    public static void indexSalaries(Employee[] employees) {
        double percent = 10;
        double indexPercent = percent / 100;
        double indexedSalary;
        for (int i = 0; i < employees.length; i++) {
            indexedSalary = employees[i].getSalary() + (employees[i].getSalary() * indexPercent);
            employees[i].setSalary((int) indexedSalary);
            System.out.println(employees[i]);
        }
    }

    public static void findPoorDepartamentEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == "Один") {
                System.out.println(employees[i]);
            }
        }
    }

}
