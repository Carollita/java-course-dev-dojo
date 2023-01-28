package academy.devdojo.javacoursedevdojo.introduction;

public class ExerciseLoopstatementBreak {
    public static void main(String[] args) {
        double total = 3000;
        for(int installment=1; installment <= total; installment++){
            double installmentValue = total / installment;
            if(installmentValue < 100) {
                break;
            }
            System.out.println("Installment " + installment + ": " + installmentValue);
        }
    }
}
