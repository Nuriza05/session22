import Java_8.classes.Student;
import Java_8.enums.Gender;
import Java_8.service.impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Student>students = new ArrayList<>();
       students.add(new Student("Nuriza",17, Gender.FEMALE, LocalDate.of(2022,11,5)));
       students.add(new Student("Adil",18,Gender.MALE,LocalDate.of(2004,4,7)));
       students.add(new Student("Adil",18,Gender.MALE,LocalDate.of(2004,4,7)));
       students.add(new Student("Askar",22,Gender.MALE,LocalDate.of(2000,4,2)));

        StudentServiceImpl student = new StudentServiceImpl();
        while (true){
            System.out.println("1.Find by Name. 2. Get Boys. 3. Get Girls");
            int num = new Scanner(System.in).nextInt();
            if(num==1) {
                System.out.println("Write name!");
                String name = new Scanner(System.in).nextLine();
                System.out.println(student.findByName(name, students));
            }
            else if(num==2){
                System.out.println(student.getBoys(students));
            } else if (num==3) {
                System.out.println(student.getGirls(students));
            }
            else throw new Exception();
        }




    }
}