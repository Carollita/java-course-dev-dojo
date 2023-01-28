package academy.devdojo.javacoursedevdojo.introduction;

public class ExerciseLoopstatementContinue {
    public static void main(String[] args) {
        double total = 3000;
        for(int installment= (int)total; installment >= 1; installment--){
            double installmentValue = total / installment;
            if(installmentValue < 100) {
                continue;
            }
            System.out.println("Installment " + installment + ": " + installmentValue);
        }
    }
}
