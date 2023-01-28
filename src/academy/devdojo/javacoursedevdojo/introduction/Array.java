package academy.devdojo.javacoursedevdojo.introduction;

public class Array {
    public static void main(String[] args) {
        // int [] list; 
        // The local variable list may not have been initialized

        int [] list = null;
        System.out.println(list);
        // only reference types can be null-initialized

        //* Array instantiation
        String[] candies = new String[3]; 
        System.out.println(candies[0]); // null

        candies[0] = "Necco Wafers";
        candies[1] = "Swedish Fish";
        candies[2] = "Reese's Peanut Butter Cups";

        System.out.println(candies[0]);
        System.out.println(candies[1]); 
        System.out.println(candies[2]); 

        int[] numbers = new int[2]; 
        numbers[0] = 10;
        numbers[1] = (int) 10.4F;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]); 
    }
}
