import java.util.Scanner;

public class CountingStudentsWhoPassed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter size Array: ");
            size = sc.nextInt();
            if(size > 30) {
                System.out.println("Size should not be more than 30! ");
            }
        }while (size > 30);

        double arr[] = new double[size];

        for (int i=0; i < arr.length; i++) {
            System.out.print("Enter element : ");
            arr[i] = sc.nextDouble();
        }
        int countStudentsWhoPass = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 5) {
                countStudentsWhoPass++;
            }
        }

        System.out.println("the number of students who passed is: " + countStudentsWhoPass);
    }
}
