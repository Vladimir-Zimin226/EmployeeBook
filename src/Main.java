
public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.createEmployee("Иванов", "Иван", "Иванович", 1, 99_000);
        employeeBook.createEmployee("Петров", "Петр", "Петрович", 1, 100_000);
        employeeBook.createEmployee("Сидоров", "Сидор", "Сидорович", 2, 120_000);
        employeeBook.createEmployee("Свиридов", "Свирид", "Свиридович", 2, 125_000);
        employeeBook.createEmployee("Егоров", "Егор", "Егорович", 3, 152_000);
        employeeBook.createEmployee("Александров", "Александр", "Александрович", 3, 140_000);
        employeeBook.createEmployee("Дмитриев", "Дмитрий", "Дмитриевич", 4, 170_000);
        employeeBook.createEmployee("Сергеев", "Сергей", "Сергеевич", 4, 180_000);
        employeeBook.createEmployee("Владимиров", "Владимир", "Владимирович", 5, 200_000);

        employeeBook.createEmployee("Семенов", "Семен", "Семенович", 2, 145_000);

        employeeBook.changeDepartamentOfEmployee("Егоров", 5, 4);

        employeeBook.changeSalaryOfEmployee("Егоров", 187_000);

        employeeBook.printAllEmployees();
    }

}





