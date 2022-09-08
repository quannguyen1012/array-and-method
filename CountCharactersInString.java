import java.util.Scanner;

public class CountCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "hello-world";

        char characters = 'l';
        int count = 0;

        for (int i=0; i < a.length(); i++) {
            if(a.charAt(i) == characters) {
                count++;
            }
        }
        System.out.println("the number of times the character occurs is: " + count);


    }
}
