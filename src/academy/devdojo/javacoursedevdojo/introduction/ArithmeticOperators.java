package academy.devdojo.javacoursedevdojo.introduction;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 12;

        //* Sum
        System.out.println(num1 + num2); // Sum = 16
        System.out.println("Value: " + num1+num2); // Concat = 412
        System.out.println(num1 + num2 + " Value: " + num1+ num2); // 16 Value: 412

        //* Subtract
        int resultSub = num1 - num2;
        System.out.println(resultSub); // -8

        //* Multiplication
        int resultMult = num1 * num2;
        System.out.println(resultMult); // 48

        //* Division
        double resultDiv = num1 / (double)num2;
        int resultDiv2 = num2 / num1;
        System.out.println(resultDiv); // 0.3333333333333333
        System.out.println(resultDiv2); // 3

        //* Modulo or Remainder of Division
        int resultRem = num2 % num1;
        System.out.println(resultRem); // 0

        int resultRem2 = num1 % num2;
        System.out.println(resultRem2); // 4
    }
}
