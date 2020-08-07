package ru.geekbrains.hw4;

public class Worker {
    String firstMiddleLastName;
    int salary, age, id;
    static int counter = 1;

    Worker(String firstMiddleLastName, int salary, int age) {
        this.firstMiddleLastName = firstMiddleLastName;
        this.salary = salary;
        this.age = age;
        this.id = counter++;
    }

    void getInfo() {
        System.out.println("ФИО: " + firstMiddleLastName + " Зарплата: " + salary + " Возраст: "
                + age + " Идентификатор: " + id);
    }

    void getReward() {
        this.salary = salary + 5000;
    }

    int getAge() {
        return age;
    }
}
