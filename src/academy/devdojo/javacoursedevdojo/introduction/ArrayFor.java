package academy.devdojo.javacoursedevdojo.introduction;

public class ArrayFor {
    public static void main(String[] args) {
    String[] candies = new String[3];
    candies[0] = "Milky Way Candy Bar";
    candies[1] = "Hershey's Kiss";
    candies[2] = "Gummi Bears";

    for(int i=0; i < candies.length; i++) {
        System.out.println(i + ": " + candies[i]);
    }

    System.out.println("---------------------------------------------------");

    candies = new String[4];
    for(int i=0; i < candies.length; i++) {
        System.out.println(i + ": " + candies[i]);
    }// return only null values
    } 
}
