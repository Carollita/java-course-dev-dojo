package academy.devdojo.javacoursedevdojo.introduction;

public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        //* Greater Than (>)
        boolean isNum1GreaterThanNum2 = num1 > num2;
        System.out.println(isNum1GreaterThanNum2); 
        // false

        //* Less Than (<)
        boolean isNum1LessThanNum2 = num1 < num2;
        System.out.println(isNum1LessThanNum2);
        // true

        //* Greater than or equal to (>=)
        boolean isNum1GreaterThanOrEqualToNum2 = num1 >= num2;
        System.out.println(isNum1GreaterThanOrEqualToNum2); 
        // false

        //* Less  than or equal to (<=)
        boolean isNum1LessThanOrEqualToNum2 = num1 <= num2;
        System.out.println(isNum1LessThanOrEqualToNum2); 
        // true

        //* Equal to (==)
        boolean isNum1EqualToNum2 = num1 == num2;
        System.out.println(isNum1EqualToNum2);
        // false

        //* Different to (!=)
        boolean isNum1DifferentToNum2 = num1 != num2;
        System.out.println(isNum1DifferentToNum2);
        // true
    }
}
