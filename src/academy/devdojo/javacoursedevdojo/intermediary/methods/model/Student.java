package academy.devdojo.javacoursedevdojo.intermediary.methods.model;

public class Student {
    public String name;
    public int age;
    public char gender;

    public void print2() {
        System.out.println("------------------------------------------");
        System.out.println(this.name);
        // System.out.println(name); it works too
        System.out.println(this.age);
        System.out.println(this.gender);
    }
    
}
