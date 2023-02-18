package academy.devdojo.javacoursedevdojo.intermediary.methods.test;

import academy.devdojo.javacoursedevdojo.intermediary.methods.model.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumNumbers();
        calculator.subtractNumbers();
        calculator.multiplyNumbers(1000, 7.5f);
        System.out.println("---------------------");
        double result = calculator.divideNumbers1(1000, 7);
        System.out.println(result);
        calculator.divideNumbers2(86, 0);
        System.out.println(calculator.divideNumbers3(86, 0));
        System.out.println(calculator.divideNumbers4(86, 0));
    }

}
