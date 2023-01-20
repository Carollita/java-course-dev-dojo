package academy.devdojo.javacoursedevdojo.introduction;

public class ExerciseConditionalStatements {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double firstTaxPerBracket = 9.70 / 100;
        double secondTaxPerBracket = 37.35 / 100;
        double thirdTaxPerBracket = 49.50 / 100;
        double taxValue;

        if(annualSalary <= 34712){
            taxValue = firstTaxPerBracket * annualSalary;
        } else if (annualSalary >= 34713 && annualSalary <= 68507){
            taxValue = secondTaxPerBracket * annualSalary;
        } else {
            taxValue = thirdTaxPerBracket * annualSalary;
        }
        System.out.println(taxValue);
    }
}
