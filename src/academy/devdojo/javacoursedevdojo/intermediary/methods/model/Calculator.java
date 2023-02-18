package academy.devdojo.javacoursedevdojo.intermediary.methods.model;

public class Calculator {
    public void sumNumbers() {
        System.out.println(1000 + 7);
    }

    public void subtractNumbers() {
        System.out.println(1000 - 7);
    }

    public void multiplyNumbers(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideNumbers1(double num1, double num2) {
        return 1000/7;
    } 

    public void divideNumbers2(double num1, double num2) {
        if(num2 == 0){
            System.out.println("It is not possible.");
            return;
        }
        System.out.println(num1/num2);
    } 

    public double divideNumbers3(double num1, double num2) {
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    } 

    public double divideNumbers4(double num1, double num2) {
        if(num2 != 0){
            return num1/num2;
        }
        return 0;
    } 

    public void modifyNumbers(int num1, int num2) {
        num1 = 19;
        num2 = 2;
        System.out.println("Day: " + num1);
        System.out.println("Month: " + num2);
    }
}
