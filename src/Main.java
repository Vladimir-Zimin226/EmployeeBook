
public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 99_000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", 1, 100_000);
        employees[2] = new Employee("Сидоров", "Сидор", "Сидорович", 2, 120_000);
        employees[3] = new Employee("Свиридов", "Свирид", "Свиридович", 2, 120_000);
        employees[4] = new Employee("Павлов", "Павел", "Павлович", 2, 140_000);
        employees[5] = new Employee("Егоров", "Егор", "Егорович", 3, 152_000);
        employees[6] = new Employee("Александров", "Александр", "Александрович", 3, 140_000);
        employees[7] = new Employee("Дмитриев", "Дмитрий", "Дмитриевич", 4, 170_000);
        employees[8] = new Employee("Сергеев", "Сергей", "Сергеевич", 4, 180_000);
        employees[9] = new Employee("Владимиров", "Владимир", "Владимирович", 5, 200_000);

        //printAllEmployees(employees);

        //calculationTotalSalary(employees);

        //findPoorEmployee(employees);

        //findReachEmployee(employees);

        //calculationAverageSalaryM1(employees);

        //calculationAverageSalaryM2(employees);

        //printEmployeesNSP(employees);

        //indexSalaries(employees);

        //findPoorDepartamentEmployee(employees, 1);

        //findReachDepartamentEmployee(employees, 5);

        //calculationTotalDepartamentSalary(employees, 1);

        //calculationAverageDepartamentSalary(employees, 5);

        //indexDepartamentSalaries(employees, 5, 50);

        //printDepartamentEmployees(employees, 5);

        //findSalaryLessRandomNumber(employees, 150000);

        //findSalaryGreatRandomNumber(employees, 180000);

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

    public static void indexSalaries(Employee[] employees, double percent) {
        double indexPercent = percent / 100;
        double indexedSalary;
        for (int i = 0; i < employees.length; i++) {
            indexedSalary = employees[i].getSalary() + (employees[i].getSalary() * indexPercent);
            employees[i].setSalary((int) indexedSalary);
            System.out.println(employees[i]);
        }
    }

    public static void findPoorDepartamentEmployee(Employee[] employees, int departament) {
        double minSalary = Double.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary && employees[i].getDepartament() == departament) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника отдела " + departament + " : " + minSalary + " руб.");
        for (int i = 0; i < employees.length; i++) {
            if (minSalary == employees[i].getSalary()) {
                System.out.println("Сотрудник: " + employees[i].getSurname() + " " + employees[i].getName());
            }
        }
    }

    public static void findReachDepartamentEmployee(Employee[] employees, int departament) {
        double maxSalary = Double.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary && employees[i].getDepartament() == departament) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника отдела " + departament + " : " + maxSalary + " руб.");
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary == employees[i].getSalary()) {
                System.out.println("Сотрудник: " + employees[i].getSurname() + " " + employees[i].getName());
            }
        }
    }

    public static void calculationTotalDepartamentSalary(Employee[] employees, int departament) {
        int totalDepartamentSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament) {
                totalDepartamentSalary += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты отдела " + departament + " в месяц составляет " + totalDepartamentSalary + " руб.");
    }


    public static void calculationAverageDepartamentSalary(Employee[] employees, int departament) {
        int totalDepartamentSalary = 0;
        int departamentEmployees = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament) {
                departamentEmployees++;
                totalDepartamentSalary += employees[i].getSalary();
//                System.out.println(departamentEmployees);
            }
        }
        int averageDepartamentSalary = totalDepartamentSalary / departamentEmployees;
        System.out.println("Средняя зарплата в отделе " + departament + " : " + averageDepartamentSalary + " руб.");
    }

    public static void indexDepartamentSalaries(Employee[] employees, int departament, double percent) {
        double indexPercent = percent / 100;
        double indexedDepartamentSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament) {
                indexedDepartamentSalary = employees[i].getSalary() + (employees[i].getSalary() * indexPercent);
                employees[i].setSalary((int) indexedDepartamentSalary);
                System.out.println(employees[i]);
            }
        }
    }

    public static void printDepartamentEmployees(Employee[] employees, int departament) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartament() == departament) {
                System.out.println("Сотрудник отдела: " + employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronimic() + ", заработная плата - " + employees[i].getSalary() + " руб.");
            }
        }
    }

    public static void findSalaryLessRandomNumber(Employee[] employees, double randomNumber) {
        System.out.println("Сотрудники с меньшей зарплатой: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < randomNumber) {
                System.out.println("id: " + employees[i].getId() + " " + employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronimic() + ", заработная плата - " + employees[i].getSalary() + " руб.");
            }
        }
    }

    public static void findSalaryGreatRandomNumber(Employee[] employees, double randomNumber) {
        System.out.println("Сотрудники с равной и большей зарплатой: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= randomNumber) {
                System.out.println("id: " + employees[i].getId() + " " + employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronimic() + ", заработная плата - " + employees[i].getSalary() + " руб.");
            }
        }
    }


}

