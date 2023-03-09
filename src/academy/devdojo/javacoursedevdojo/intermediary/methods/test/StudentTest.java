package academy.devdojo.javacoursedevdojo.intermediary.methods.test;

import academy.devdojo.javacoursedevdojo.intermediary.methods.model.PrintStudent;
import academy.devdojo.javacoursedevdojo.intermediary.methods.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
    
        student1.name = "Midoriya";
        student1.age = 16;
        student1.gender = 'M';

        student2.name = "Todoroki";
        student2.age = 16;
        student2.gender = 'M';

        PrintStudent printer = new PrintStudent();
        printer.print(student1);
        printer.print(student2);

        System.out.println("##########################################");

        printer.print(student1);
        printer.print(student2);
    }
}
