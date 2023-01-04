package ru.netology;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public PersonBuilder() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException(
                    "Возраст не может быть меньше 0 или больше 150"
            );
        }
         this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return  this;
    }

    public Person build() {

        if (name == null) {
            throw new IllegalStateException(
                    "Имя не может быть null"
            );
        }
        if (surname == null) {
            throw new IllegalStateException(
                    "Фамилия не может быть null"
            );
        }
        Person person;
        if (age != -1) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        if (city != null) {
            person.setAddress(city);
        }
        return person;
    }
}

