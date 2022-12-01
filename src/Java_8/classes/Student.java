package Java_8.classes;

import Java_8.Exceptions.MyException;
import Java_8.enums.Gender;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private LocalDate dateOfBirth;

    public Student(String name, int age, Gender gender, LocalDate dateOfBirth) throws MyException {


        this.gender = gender;

        exception(dateOfBirth, name, age);
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    private static void exception(LocalDate dateOfBirth, String name, int age) throws MyException {
        LocalDate l = LocalDate.now();
        int w = l.compareTo(dateOfBirth);
        if (w < 0) {
            throw new MyException("Exception in Date of birth!");
        }
        if (!name.matches("[a-zA-Za-яА-Я]*")) {
            throw new MyException("Name is incorrect!");
        }
        if (age < 0) {
            throw new MyException("Age can not be a negative number!");

        }
    }
}
