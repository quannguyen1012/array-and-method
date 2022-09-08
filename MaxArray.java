import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {

        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if(size > 20 ) {
                System.out.println("Size should not exceed 20");
            }
        }while (size > 20);

        arr = new int[size];
        int i=0;
        while (i < arr.length) {
            System.out.println("Enter element : ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.println("Property list: ");
        for (int j=0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        int max = arr[0];
        int index = 1;
        for(int k = 1 ; k < arr.length; k++) {
            if(max < arr[k]) {
                max = arr[k];
                index = k + 1;
            }
        }
        System.out.println("The largest property value in the list is: " + max + " , at position : " + index);

    }
}
