import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,5,7,8,9};

        MinArray(arr);
    }
    public static void MinArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The smallest element in the array is: " + min);
    }
}
