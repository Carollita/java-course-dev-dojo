package academy.devdojo.javacoursedevdojo.introduction;

public class LogicalOperators {
    public static void main(String[] args) {
        //* And (&&)
        int age = 19;
        float salary = 3550F;
        boolean isAgeGreaterThan30 = age >= 30 && salary >= 4612;
        boolean isAgeLessThan30 = age < 30 && salary >= 3381;

        System.out.println("Age is greater than 30: " + isAgeGreaterThan30);
        System.out.println("Age is less than 30: " + isAgeLessThan30);

        //* Or (||)
        double totalCheckingAccount = 200;
        double totalSavingsAccount = 8000;

        float playstation5Value = 5000;
        boolean isBuyable = totalCheckingAccount > playstation5Value || totalSavingsAccount > playstation5Value;

        System.out.println(isBuyable + ", I can buy a playstation 5");
        // true
    }
}
