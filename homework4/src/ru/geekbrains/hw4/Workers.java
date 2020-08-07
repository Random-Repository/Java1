package ru.geekbrains.hw4;

public class Workers {
    public static void main(String[] args) {
        Worker[] Workers = new Worker[5];
        Workers[0] = new Worker("Зеленоглебск Борис Васильевич", 58000, 64);
        Workers[1] = new Worker("Прибауткин Василий Калькуляторович", 39000, 43);
        Workers[2] = new Worker("Непонятый Аркадий Электродович", 7000, 30);
        Workers[3] = new Worker("Интовый Геннадий Борисович", 160000, 28);
        Workers[4] = new Worker("Оригинальный Семён Владимирович", 348000, 46);

        for (Worker w:Workers) if (w.getAge() > 45) w.getReward();
        for (Worker w:Workers) if (w.getAge() > 40) w.getInfo();
        }

    }
