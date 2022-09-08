import java.util.Arrays;
import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double arr[][] = new double[3][3];

        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr.length; j++){
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextDouble();
            }
        }
        double sum1 = 0;
        double sum2 = 0;
        int count = arr.length-1;
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr.length; j++ ) {
                if(i == j) {
                    sum1 += arr[i][j];
                }
                if (j == count) {
                    sum2 += arr[i][j];
                    count--;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.print("main diagonal 1: " + sum1);
        System.out.println();
        System.out.print("main diagonal 2: " + sum2);

    }
}
