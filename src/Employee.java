import java.util.Objects;

public class Employee {

    private static int count = 0;
    private final String surname;
    private final String name;
    private final String patronimic;
    private int departament;
    private int salary;
    private int id;


    public Employee(String surname, String name, String patronimic, int departament, int salary) {
        this.surname = validateSurname(surname);
        this.name = validateName(name);
        this.patronimic = validatePatronimic(patronimic);
        this.departament = validateDepartament(departament);
        this.salary = validateSalary(salary);
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

    public static int getCount() {
        return count;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && id == employee.id && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, departament, id);
    }

    private int validateDepartament(int departament) {
        return departament < 1 || departament > 5 ? 1 : departament;
    }

    private int validateSalary(int salary) {
        return salary < 0 ? 25_000 : salary;
    }

    private String validateSurname(String surname) {
        return surname == null ? "WithoutSurname" : surname;
    }

    private String validateName(String name) {
        return name == null ? "WithoutName" : name;
    }

    private String validatePatronimic(String patronimic) {
        return patronimic == null ? "WithoutPatronimic" : patronimic;
    }
}

