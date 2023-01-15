package academy.devdojo.javacoursedevdojo.introduction;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 19;
        float salary = 3550F;
        boolean isAgeGreaterThan30 = age >= 30 && salary >= 4612;
        boolean isAgeLessThan30 = age < 30 && salary >= 3381;

        System.out.println("Age is greater than 30: " + isAgeGreaterThan30);
        System.out.println("Age is less than 30: " + isAgeLessThan30);
    }
}
