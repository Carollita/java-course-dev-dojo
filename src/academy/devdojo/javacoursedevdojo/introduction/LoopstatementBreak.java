package academy.devdojo.javacoursedevdojo.introduction;

public class LoopstatementBreak {
    public static void main(String[] args) {
        int maxNumber = 20;
        for(int i=0; i <= maxNumber; i++) {
            if(i > 15) {
                break;
            }
        System.out.print(i + " ");
        }
    }
}