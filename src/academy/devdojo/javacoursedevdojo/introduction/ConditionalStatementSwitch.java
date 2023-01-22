package academy.devdojo.javacoursedevdojo.introduction;

public class ConditionalStatementSwitch {
    public static void main(String[] args) {
        byte day = 5;
        switch(day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Invalid option");
        }

        // {} on case structure is opticional
        char choise = 'y';
        switch(choise) {
            case 'y': {
                System.out.println("yes");
                break;
            }
            case 'n': {
                System.out.println("no");
                break;
            }
        } 
    }
}
