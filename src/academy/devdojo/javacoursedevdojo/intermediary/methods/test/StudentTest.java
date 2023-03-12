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

        System.out.println("##########################################");
        System.out.println("PrintStudent Class method print1: ");
        PrintStudent printer = new PrintStudent();
        printer.print1(student1);
        printer.print1(student2);

        System.out.println("##########################################");
        System.out.println("Define student.name: ");

        printer.print1(student1);
        printer.print1(student2);

        System.out.println("##########################################");
        System.out.println("Student Class method print2 using .this: ");

        student1.print2();
        student2.print2();
        
    }
}
