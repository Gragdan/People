package ru.netology;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() { return getAddress() != null; }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(city)
                .setAge(0);
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getAddress() { return  city; }

    public void setAddress(String address) { this.city = address; }

    public void happyBirthday() {
        if (hasAge()) {
            age = age+1;
        }
    }

    @Override
    public String toString() { return name + " " + surname + " возраст: "  + age + " город " + city;}

}
