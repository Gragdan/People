package ru.netology;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person parent = new PersonBuilder()
                .setName("Иван")
                .setSurname("Иванов")
                .setAge(34)
                .setAddress("Москва")
                .build();
        //   System.out.println(parent);
        Person son = parent.newChildBuilder()
                .setName("Антон")
                .build();
        parent.happyBirthday();
        son.happyBirthday();

        System.out.println("Родитель: \n" + parent + "\nего ребенок: \n" + son);
    }
}