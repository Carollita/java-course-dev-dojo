package academy.devdojo.javacoursedevdojo.introduction;

public class Loopstatement {
    public static void main(String[] args) {
        // While 
        System.out.println("\n********************* While - Count 1 to 10 *********************");
        int count = 0;
        while(count < 10) {
            System.out.println(++count);
        } // You can omit braces

        // Do While 
        System.out.println("\n********************* Do While - Count 1 to 10 *********************");

        count = 1;
        do {
            System.out.println(count++);
        } while (count <= 10);

        System.out.println("\n********************* Do While - False *********************");

        count = 12;
        do {
            System.out.println(count);
        } while (count < 10);
        // For
        System.out.println("\n********************* For  - Count 1 to 10 *********************");
        for(int i=1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
