package academy.devdojo.javacoursedevdojo.intermediary.methods.test;

import academy.devdojo.javacoursedevdojo.intermediary.methods.model.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumNumbers();
        calculator.subtractNumbers();
        calculator.multiplyNumbers(1000, 7.5f);
        double result = calculator.divideNumbers(1000, 7);
        System.out.println(result);
    }
}
