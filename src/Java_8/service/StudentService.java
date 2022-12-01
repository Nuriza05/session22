package Java_8.service;

import Java_8.classes.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface StudentService  {
    ArrayList<Student> findByName(String name, ArrayList<Student>students);
    ArrayList<Student> getBoys(ArrayList<Student>students);
    ArrayList<Student> getGirls(ArrayList<Student>students);


}
