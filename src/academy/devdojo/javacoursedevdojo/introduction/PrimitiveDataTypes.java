package academy.devdojo.javacoursedevdojo.introduction;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int myAge = 18;
        System.out.println("My age is " + myAge);

        long people = 200000;
        System.out.println(people);

        double salaryDouble = 650;
        float salaryFloat = 650;
        System.out.println(salaryDouble + " " + salaryFloat);

        byte quantity = 8;
        short years = 12;
        System.out.println(quantity + " " + years);

        boolean isTrue = true; 
        boolean isFalse = false; 
        System.out.println(isTrue);
        System.out.println(isFalse);

        char letter = 65; // return letter A
        char gender = 'M';
        char unicode = '\u2615';
         // to be able to print emojis use this command in the terminal: chcp 65001
        System.out.println(letter + " " + gender + " " + unicode);
    }
}