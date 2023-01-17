package academy.devdojo.javacoursedevdojo.introduction;

public class ConditionalStatementIf {
    public static void main(String[] args) {
        if(true){
            System.out.println("It is true");
        } 

        if(true) System.out.println("It is not a good pratice");

        String name = "Xafael Lee";
        int age = 16;
        boolean isAuthorized = age >= 18;
    
        if(isAuthorized){
            System.out.println(name + " is over 18 and can buy a beer!");
        }

        // if(isAuthorized == false){}
        if(!isAuthorized){
            System.out.println(name + " is underage and can not buy a beer!.");
        }
    }
}
