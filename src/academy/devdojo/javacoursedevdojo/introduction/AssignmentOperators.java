package academy.devdojo.javacoursedevdojo.introduction;

public class AssignmentOperators {
    public static void main(String[] args) {
        //* +=
        double bonus = 900;
        bonus += 2000; 
        // bonus = bonus + 1000;

        System.out.println(bonus);

        //* -=
        bonus -= 100;
        System.out.println(bonus);
        // 2800.0

        //* *=
        bonus *= 2;
        System.out.println(bonus);
        // 5600.0

        //* /=
        bonus /= 2;
        System.out.println(bonus);
        // 2800.0

        //* %=
        bonus %= 2;
        System.out.println(bonus);
        // 0.0

        //* Counter
        int counter = 0;

        // counter += 1
        counter++; 
        System.out.println(counter); // 1

        counter--;
        System.out.println(counter); // 0

        ++counter; 
        System.out.println(counter); // 1

        --counter;
        System.out.println(counter); // 0

        //* Difference between counter++ and ++counter
        System.out.println(counter++); // 0 (print before sum)
        System.out.println(counter); // 1 (added value)
        System.out.println(++counter); // 2 (sum and after print)
    }
}