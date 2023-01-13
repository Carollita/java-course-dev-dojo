package academy.devdojo.javacoursedevdojo.introduction;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        System.out.println("----------------------------------- Data Types -----------------------------------");
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

        // * Casting
        System.out.println("------------------------------------ Casting ------------------------------------");
        float pi = 3.14f; //Compiles
        //float pi = 3.14;  Doesn't compile, because you're trying to put a double literal in a float without a cast. You need to put the 'f' at the end, otherwise Java will assume its a double.
        System.out.println(pi);

        int age2=(int)10000000000L; // Transform a long to int
        System.out.println(age2); //since it didn't fit, it cuts the bits, because it forces the entry of values
        //1410065408
    }
}