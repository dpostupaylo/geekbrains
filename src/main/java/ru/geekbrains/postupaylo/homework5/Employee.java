package ru.geekbrains.postupaylo.homework5;

public class Employee {
    private String fio;
    private String jobTitle;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fio, String jobTitle, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void printToConsole(){
        System.out.println("ФИО: " + this.fio +
                "Должность: " + this.jobTitle +
                "email: " + this.email +
                "Телефон: " + this.phone +
                "Зарплата: " + this.salary +
                "Возраст: " + this.age);
    }
}
