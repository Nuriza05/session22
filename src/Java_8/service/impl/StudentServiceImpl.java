package Java_8.service.impl;

import Java_8.classes.Student;
import Java_8.enums.Gender;
import Java_8.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    @Override
    public ArrayList<Student> findByName(String name , ArrayList<Student>students) {
        ArrayList<Student>students1=new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equals(name)) {
                students1.add(student);
            }
        }
            return students1;
    }

    @Override
    public ArrayList<Student> getBoys(ArrayList<Student> students) {
        ArrayList<Student>students1=new ArrayList<>();
        for (Student student : students) {
            if(student.getGender().equals(Gender.MALE)){
                students1.add(student);
            }
        }return students1;
    }

    @Override
    public  ArrayList<Student> getGirls(ArrayList<Student> students) {
        ArrayList<Student>students1=new ArrayList<>();
        for (Student student : students) {
            if(student.getGender().equals(Gender.FEMALE)){
                students1.add(student);
            }
        }return students1;
    }
}
