package academy.devdojo.javacoursedevdojo.introduction;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // Months: 1, 2, 3
        // Days: 31, 28, 31

        int[][] daysInMonth = new int[3][3];
        daysInMonth[0][0] = 31; 
        daysInMonth[0][1] = 28; 
        daysInMonth[0][2] = 31; 

        daysInMonth[1][0] = 30; 
        daysInMonth[1][1] = 31; 
        daysInMonth[1][2] = 30; 

        // int[][] daysInMonth = { {31, 28, 31}, {30, 31, 30}};

        System.out.println(daysInMonth[0]); // [I@36baf30c
        System.out.println(daysInMonth[0][0]); // 31
        System.out.println(daysInMonth[1][0]); // 30
        
        System.out.println("------------------------------");

        // For
        for(int i=0; i < daysInMonth.length; i++) {
            for(int j=0; j < daysInMonth[i].length; j++) {
                System.out.println(daysInMonth[i][j]);
            }
        }

        System.out.println("------------------------------");

        // For Each
        for(int[] arr : daysInMonth) {
            for(int i : arr) {
                System.out.println(i);
            }
        }

        // Initialization
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[] {1, 2, 3};
        arrayInt[2] = new int[6];

        // int[][] arrayInt = { {0, 0, 0}, {1, 2, 3},{0, 0, 0, 0, 0, 0}};

        for(int[] index:arrayInt) {
            System.out.println("\n--------");
            for(int num:index) {
                System.out.print(num + " ");
            }
        }
    }
}



