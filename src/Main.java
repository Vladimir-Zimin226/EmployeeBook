import java.util.Arrays;

public class Main {

    public static void printAllEmployees(String[] employee) {
        for (int i = 0; i < employee.length; i++) System.out.println(employee[i]);
    }

    public static void main(String[] args) {

        String[] employee = new String[10];

        employee[0] = String.valueOf(new Employee("Иванов", "Иван", "Иванович", "Один", 100_000));
        employee[1] = String.valueOf(new Employee("Петров", "Петр", "Петрович", "Один", 100_000));
        employee[2] = String.valueOf(new Employee("Сидоров", "Сидор", "Сидорович", "Два", 120_000));
        employee[3] = String.valueOf(new Employee("Свиридов", "Свирид", "Свиридович", "Два", 120_000));
        employee[4] = String.valueOf(new Employee("Павлов", "Павел", "Павлович", "Три", 140_000));
        employee[5] = String.valueOf(new Employee("Егоров", "Егор", "Егорович", "Три", 140_000));
        employee[6] = String.valueOf(new Employee("Александров", "Александр", "Александрович", "Три", 140_000));
        employee[7] = String.valueOf(new Employee("Дмитриев", "Дмитрий", "Дмитриевич", "Четыре", 170_000));
        employee[8] = String.valueOf(new Employee("Сергеев", "Сергей", "Сергеевич", "Четыре", 170_000));
        employee[9] = String.valueOf(new Employee("Владимиров", "Владимир", "Владимирович", "Пять", 200_000));

        printAllEmployees(employee);

    }
}