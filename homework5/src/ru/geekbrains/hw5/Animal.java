package ru.geekbrains.hw5;

import java.util.Random;

public class Animal {
    public static class Animals {//super class
        public Animals(String name) {
            this.name = name;
        }
        protected String name;
        protected String type;
        protected int runMax;
        protected int swimMax;
        protected double jumpMax;
        public Random rng = new Random();
        public void run(int dist) {
            if (this.runMax >= dist) System.out.println(this.type + " " + this.name + " пробежит " + dist + " метров.");
            else System.out.println(this.type + " " + this.name + " не добежит.");
        }
        public void swim(int dist) {
            if (this.swimMax >= dist) System.out.println(this.type +" " + this.name + " проплывёт " + dist + " метров.");
            else System.out.println(this.type + " " + this.name + " не поплывёт.");
        }
        public void jump(double height) {
            if (this.jumpMax >= height)
                System.out.println(this.type +" " + this.name +" прыгнет " + height + " метров.");
            else System.out.println(this.type + " " + this.name +" не прыгнет.");
        }
        public void info() {
            System.out.println(this.type +" " + this.name + " Бегает: " + this.runMax + " метров. | Плавает: " + this.swimMax +" метров. | Прыгает: " + this.jumpMax + " метров.");
        }
    }
    public static class Cat extends Animals {
        public Cat(String name) {
            super(name);
            this.type = ("Кошка");
            this.runMax = rng.nextInt(100) + 200;
            this.jumpMax = rng.nextFloat() + 0.3;
        }
    public static class Dog extends Animals {
        public Dog(String name) {
            super(name);
            this.type = ("Собака");
            this.runMax = rng.nextInt(100) + 400;
            this.swimMax = rng.nextInt(10) + 2;
            this.jumpMax = rng.nextFloat() + 0.1;
            }
        }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Шуша");
        Cat cat2 = new Cat("Снежок");
        Cat cat3 = new Cat("Ромашка");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Дементий");
        Dog dog3 = new Dog("Барбос");
        cat1.info();
        cat2.info();
        cat3.info();
        dog1.info();
        dog2.info();
        dog3.info();
        dog1.run(170);
        dog1.swim(3);
        dog1.jump(0.4);
        dog2.run(530);
        dog2.swim(15);
        dog2.jump(0.7);
        cat1.run(330);
        cat1.swim(2);
        cat1.jump(0.9);
        cat2.run(240);
        cat2.swim(6);
        cat2.jump(0.6);
        }
    }
}