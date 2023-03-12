package academy.devdojo.javacoursedevdojo.intermediary.methods.test;

import academy.devdojo.javacoursedevdojo.intermediary.methods.model.Calculator;

public class CalculatorTest2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("-------------- Array -----------");
        int[] num1 = {1,2,3,4,5};
        calculator.sumArray(num1);
        calculator.sumArray(new int[] {1,2,3,4,5});
        // calculator.sumArray(1,2,3,4,5); error

        System.out.println("------------- VarArgs ----------");
        calculator.sumVarArgs1(num1);
        calculator.sumVarArgs1(1,2,3,4,5);

        calculator.sumVarArgs2(1,2,3,4,5);
    }
}
