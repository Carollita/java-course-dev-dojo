package academy.devdojo.javacoursedevdojo.introduction;

public class ConditionalStatementTernaryOperator {
    public static void main(String[] args) {
        double salary = 650;
        String result;

        result = salary > 400 ? "I will donate R$ 30!" : "I can't donate...";
        System.out.println(result);

    //     if (salary > 400){
    //         result = "I will donate R$ 30!";
    //     } else{
    //         result = "I can't donate...";
    //     }
 
    //* Ternary with if, else if and else
    int age = 18;
    String stageOfLife = "";

    stageOfLife = age <= 10 ? "Child!" : age <= 18 ? "Teenager!" : " is a adult!";

    System.out.println(stageOfLife);
    }
}
