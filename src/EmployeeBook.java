public class EmployeeBook {

    private final Employee[] employees = new Employee[10];

    /**
     * Печать всех имеющихся сотрудников
     */
    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /**
     * Вычисление и печать сумм затрат на зарплаты всех сотрудников
     */
    public double calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц составляет " + totalSalary + " руб.");
        return totalSalary;
    }

    /**
     * Поиск и выод сотрудника с наименьшей зарплатой
     */
    public void findPoorEmployee() {
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

    /**
     * Поиск и выод сотрудника с наибольшей зарплатой
     */
    public void findReachEmployee() {
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

    /**
     * Вычисление и печать средней зарплаты сотрудников
     */
    public void calculationAverageSalary() {
        double averageSalary = calculateTotalSalary() / Employee.getCount();
        System.out.println("Средняя зарплата в компании: " + averageSalary + " руб.");
    }

    /**
     * Печать сотрудников по параметрам: Ф.И.О.
     */
    public void printEmployeesFullName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Сотрудник: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic());
            }
        }
    }

    /**
     * Индексация зарплаты на планируемый процент и печать результатов. Параметр - процент
     */
    public void indexSalaries(double percent) {
        double indexPercent = percent / 100;
        double indexedSalary;
        for (Employee employee : employees) {
            indexedSalary = employee.getSalary() + (employee.getSalary() * indexPercent);
            employee.setSalary((int) indexedSalary);
            System.out.println(employee);
        }
    }

    /**
     * Поиск и печать сотрудника отдела с наименьшей зарплатой. Параметр - отдел
     */
    public void findPoorDepartamentEmployee(int departament) {
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

    /**
     * Поиск и печать сотрудника отдела с наибольшей зарплатой. Параметр - отдел
     */
    public void findReachDepartamentEmployee(int departament) {
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

    /**
     * Вычисление и печать общей зарплаты всех сотрудников отдела. Параметр - отдел
     */
    public int calculationTotalDepartamentSalary(int departament) {
        int totalDepartamentSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                totalDepartamentSalary += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты отдела " + departament + " в месяц составляет " + totalDepartamentSalary + " руб.");
        return totalDepartamentSalary;
    }

    /**
     * Вычисление средней зарплаты сотрудников отдела. Параметр - отдел
     */
    public float calculationAverageDepartamentSalary(int departament) {
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

    /**
     * Индексация зарплат сотрудников по отделу. Параметры: отдел, процент
     */
    public void indexDepartamentSalaries(int departament, double percent) {
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

    /**
     * Печать сотрудников по интересуему отделу. Параметр - отдел
     */
    public void printDepartamentEmployees(int departament) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartament() == departament) {
                System.out.println("Сотрудник отдела: " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic() + ", заработная плата - " + employee.getSalary() + " руб.");
            }
        }
    }

    /**
     * Поиск и печать сотрудника(-ков) с зарплатой, меньше указанной. Параметр - любое число
     */
    public void findSalaryLessRandomNumber(double randomNumber) {
        System.out.println("Сотрудники с меньшей зарплатой: ");
        for (Employee employee : employees) {
            if (employee.getSalary() < randomNumber) {
                System.out.println("id: " + employee.getId() + " " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic() + ", заработная плата - " + employee.getSalary() + " руб.");
            }
        }
    }

    /**
     * Поиск и печать сотрудника(-ков) с зарплатой, равной и больше указанной. Параметр - любое число
     */
    public void findSalaryGreatRandomNumber(double randomNumber) {
        System.out.println("Сотрудники с равной и большей зарплатой: ");
        for (Employee employee : employees) {
            if (employee.getSalary() >= randomNumber) {
                System.out.println("id: " + employee.getId() + " " + employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic() + ", заработная плата - " + employee.getSalary() + " руб.");
            }
        }
    }

    /**
     * Метод добавления нового сотрудника в массив на пустое место. Принимает все необходимые параметры сотрудника
     */
    public void createEmployee(String surname, String name, String patronimic, int departament, int salary) {
        int index = findFreeIndex();
        if (index == -1) {
            System.out.println("Штат полный. Принять на работу нового сотрудника нельзя.");
            return;
        }
        employees[index] = new Employee(surname, name, patronimic, departament, salary);
    }

    /**
     * Поиск пустого места в массиве сотрудников
     */
    private int findFreeIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Метод удаления сотрудника из массива
     */
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    /**
     * Метод изменения зарплаты сотрудника. Параметры: фамилия, новая зарплата
     */
    public void changeSalaryOfEmployee(String surname, int salary) {
        for (Employee employee : employees) {
            if (employee.getSurname().equals(surname)) {
                employee.setSalary(salary);
            }
        }
    }

    /**
     * Метод изменения отдела сотрудника. Параметры: фамилия, новый отдел
     */
    public void changeDepartamentOfEmployee(String surname, int id, int departament) {
        for (Employee employee : employees) {
            if (employee.getSurname().equals(surname)) {
                employee.setSalary(departament);
            }
        }
    }

    /**
     * Печать сотрудников списком, по отделам
     */
    public void EmployeeByDepartaments() {
        System.out.println("Сотрудники отдела № 1");
        for (Employee employee : employees) {
            if (employee.getDepartament() == 1) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic());
            }
        }
        System.out.println("Сотрудники отдела № 2");
        for (Employee employee : employees) {
            if (employee.getDepartament() == 2) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic());
            }
        }
        System.out.println("Сотрудники отдела № 3");
        for (Employee employee : employees) {
            if (employee.getDepartament() == 3) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic());
            }
        }
        System.out.println("Сотрудники отдела № 4");
        for (Employee employee : employees) {
            if (employee.getDepartament() == 4) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic());
            }
        }
        System.out.println("Сотрудники отдела № 5");
        for (Employee employee : employees) {
            if (employee.getDepartament() == 5) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronimic());
            }
        }
    }

}
