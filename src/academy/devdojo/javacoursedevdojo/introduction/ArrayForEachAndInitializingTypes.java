package academy.devdojo.javacoursedevdojo.introduction;

public class ArrayForEachAndInitializingTypes {
    public static void main(String[] args) {
        // Type 01
        String[] characters = new String[3];
        characters[0] = "Shinichi Kudo";
        characters[1] = "Conan Edogawa";
        characters[2] = "Ran Mouri";

        // Type 02
        String[] characters2 ={"Kogoro Mouri", "Eri Kisaki", "Hiroshi Agasa", "Juzo Megure"};   

        // Type 03
        String[] characters3 = new String[]{"Ayumi Yoshida", "Mitsuhiko Tsuburaya", "Genta Kojima", "Ai Haibara"};   

        // For Each
        System.out.println("----------------------------------------------------");
        for(String i:characters) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------");
        for(String i:characters2) {
            System.out.println(i);
        }

        System.out.println("----------------------------------------------------");
        for(String i:characters3) {
            System.out.println(i);
        }
    }
}
