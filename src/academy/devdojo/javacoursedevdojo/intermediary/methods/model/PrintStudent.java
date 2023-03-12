package academy.devdojo.javacoursedevdojo.intermediary.methods.model;

public class PrintStudent {
    public void print1(Student student) {
        System.out.println("------------------------------------------");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        student.name = "Bakugou";
    }
}