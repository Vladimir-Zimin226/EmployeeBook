public class Employee {

    private static int count = 0;
    private final String surname;
    private final String name;
    private final String patronimic;
    private int departament;
    private int salary;
    private int id;


    public Employee(String surname, String name, String patronimic, int departament, int salary) {
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

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
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

