package academy.devdojo.javacoursedevdojo.introduction;

public class ConditionalStatementElseIf {
    public static void main(String[] args) {
        String name = "Xabriel";
        int age = 13;
        String message = "";

        if(age <= 10){
            message = name + " is a child!";
        } else if(age <= 18){
            message = name + " is a teenager!";
        } else {
           message = name + " is a adult!";
        }
        System.out.println(message);
    }
}
