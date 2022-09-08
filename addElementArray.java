import java.util.Arrays;
import java.util.Scanner;
public class addElementArray {
    public static void main(String[] args) {
        int N[] = {1,24,3,6,2,124,5,62,6,1,0,0};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to insert");
        int x = sc.nextInt();
        System.out.println("Enter the position you want to insert: ");
        int index = sc.nextInt();

        for (int i = N.length-1; i >= 0; i--) {
            if(i == index - 1) {
                break;
            }
            N[i] = N[i-1];
        }

        for (int i = index; i < N.length; i++) {
            if(i == index) {
                N[i] = x;
                break;
            }
        }
        System.out.println(Arrays.toString(N));
    }
}
