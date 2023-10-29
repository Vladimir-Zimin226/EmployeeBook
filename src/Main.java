
public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 99_000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", 1, 100_000);
        employees[2] = new Employee("Сидоров", "Сидор", "Сидорович", 2, 120_000);
        employees[3] = new Employee("Свиридов", "Свирид", "Свиридович", 2, 125_000);
        employees[4] = new Employee("Павлов", "Павел", "Павлович", 2, 140_000);
        employees[5] = new Employee("Егоров", "Егор", "Егорович", 3, 152_000);
        employees[6] = new Employee("Александров", "Александр", "Александрович", 3, 140_000);
        employees[7] = new Employee("Дмитриев", "Дмитрий", "Дмитриевич", 4, 170_000);
        employees[8] = new Employee("Сергеев", "Сергей", "Сергеевич", 4, 180_000);
        employees[9] = new Employee("Владимиров", "Владимир", "Владимирович", 5, 200_000);

        //printAllEmployees();

        //calculateTotalSalary();

        //findPoorEmployee();

        //findReachEmployee();

        //calculationAverageSalary();

        //printEmployeesFullName();

        //indexSalaries(20);

        //findPoorDepartamentEmployee(4);

        //findReachDepartamentEmployee(4);

        //calculationTotalDepartamentSalary(2);

        //calculationAverageDepartamentSalary(3);

        //indexDepartamentSalaries(3, 50);

        //printDepartamentEmployees(4);

        //findSalaryLessRandomNumber(150000);

        findSalaryGreatRandomNumber(180000);

    }


    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + totalSalary + " руб.");
        return totalSalary;
    }

    public static void findPoorEmployee() {
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника: " + minSalary + " руб.");
        for (Employee employee : employees) {
            if (minSalary == employee.getSalary()) {
                System.out.println("Сотрудник: " + employee.getSurname() + " " + employee.getName());
            }
        }
    }

    public static void findReachEmployee() {
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная затрата сотрудника: " + maxSalary + " руб.");
        for (Employee employee : employees) {
            if (maxSalary == employee.getSalary()) {
                System.out.println("Сотрудник: " + employee.getSurname() + " " + employee.getName());
            }
        }
    }

    public static void calculationAverageSalary() {
        double averageSalary = calculateTotalSalary() / Employee.getCount();
        System.out.println("Средняя зарплата в компании: " + averageSalary + " руб.");
    }

    public static void printEmployeesFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Сотрудник: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic());
            }
        }
    }

    public static void indexSalaries(double percent) {
        double indexPercent = percent / 100;
        double indexedSalary;
        for (Employee employee : employees) {
            indexedSalary = employee.getSalary() + (employee.getSalary() * indexPercent);
            employee.setSalary((int) indexedSalary);
            System.out.println(employee);
        }
    }

    public static void findPoorDepartamentEmployee(int departament) {
        System.out.println("Сотрудник с наименьшей зарплатой в отделе: ");
        double minSalary = Double.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartament() != departament) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println(result);
    }


    public static void findReachDepartamentEmployee(int departament) {
        System.out.println("Сотрудник с наибольшей зарплатой в отделе: ");
        double maxSalary = Double.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartament() != departament) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println(result);
    }

    public static int calculationTotalDepartamentSalary(int departament) {
        int totalDepartamentSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                totalDepartamentSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты отдела " + departament + " в месяц составляет " + totalDepartamentSalary + " руб.");
        return totalDepartamentSalary;
    }

    public static float calculationAverageDepartamentSalary(int departament) {
        int totalDepartamentSalary = 0;
        int departamentEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                departamentEmployees++;
                totalDepartamentSalary += employee.getSalary();
                int averageDepartamentSalary = totalDepartamentSalary / departamentEmployees;
                System.out.println("Средняя зарплата в отделе " + departament + " : " + averageDepartamentSalary + " руб.");
            }

        }
        return totalDepartamentSalary;
    }

        public static void indexDepartamentSalaries (int departament, double percent){
            double indexPercent = percent / 100;
            double indexedDepartamentSalary;
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartament() == departament) {
                    indexedDepartamentSalary = employee.getSalary() + (employee.getSalary() * indexPercent);
                    employee.setSalary((int) indexedDepartamentSalary);
                    System.out.println(employee);
                }
            }
        }

        public static void printDepartamentEmployees (int departament){
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartament() == departament) {
                    System.out.println("Сотрудник отдела: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic() + ", заработная плата - " + employee.getSalary() + " руб.");
                }
            }
        }

        public static void findSalaryLessRandomNumber (double randomNumber){
            System.out.println("Сотрудники с меньшей зарплатой: ");
            for (Employee employee : employees) {
                if (employee.getSalary() < randomNumber) {
                    System.out.println("id: " + employee.getId() + " " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic() + ", заработная плата - " + employee.getSalary() + " руб.");
                }
            }
        }

        public static void findSalaryGreatRandomNumber (double randomNumber){
            System.out.println("Сотрудники с равной и большей зарплатой: ");
            for (Employee employee : employees) {
                if (employee.getSalary() >= randomNumber) {
                    System.out.println("id: " + employee.getId() + " " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic() + ", заработная плата - " + employee.getSalary() + " руб.");
                }
            }
        }


    }





