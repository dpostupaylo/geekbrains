package ru.geekbrains.postupaylo.homework5;

public class Application {
    public static void main(String[] args) {
        Employee[] employees = new Employee[9];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 32);
        employees[1] = new Employee("Sidorov Sidr", "Manager", "ivivan@mailbox.com", "892312312", 30000, 41);
        employees[2] = new Employee("Petrov Petr", "Head of QA", "ivivan@mailbox.com", "892312312", 30000, 40);
        employees[3] = new Employee("Nikolaev Nikolay", "QA", "ivivan@mailbox.com", "892312312", 30000, 59);
        employees[4] = new Employee("Stepanov Stepan", "Developer", "ivivan@mailbox.com", "892312312", 30000, 20);
        employees[5] = new Employee("Sergeev Sergey", "Developer", "ivivan@mailbox.com", "892312312", 30000, 25);
        employees[6] = new Employee("Andreev Andrey", "HR", "ivivan@mailbox.com", "892312312", 30000, 56);
        employees[7] = new Employee("Michailov Michail", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 17);
        employees[8] = new Employee("Dmitriev Dmitrii", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 34);

        for (Employee employee :
                employees) {
            if (employee.getAge() > 40)
                employee.printToConsole();
        }
    }
}
