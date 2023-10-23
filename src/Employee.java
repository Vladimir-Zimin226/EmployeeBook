public class Employee {

    private static int count = 0;
    private final String surname;
    private final String name;
    private final String patronimic;
    private String departament;
    private int salary;
    private int id;


    public Employee(String surname, String name, String patronimic, String departament, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.departament = departament;
        this.salary = salary;
        count++;
        id = count;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public String getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Сотрудник " + id + " - " +
                "Фамилия: " + surname +
                " Имя: " + name +
                " Отчетство: " + patronimic +
                ". Работает в отделе: " + departament +
                ", Заработная плата: " + salary + " руб.";
    }

}

