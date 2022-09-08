import java.util.Arrays;
import java.util.Scanner;

public class BT_MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size Array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i=0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 1 ; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Element min in Array is: " + min);
    }
}
