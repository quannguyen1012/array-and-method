import java.util.Arrays;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int arr[][] = {{1,2,5},{4,7,6},{8,9,3}};

        System.out.print("What column do you want to sum?: ");
        int user = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(j == user) {
                    sum += arr[i][j];

                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.print(sum);
    }
}
