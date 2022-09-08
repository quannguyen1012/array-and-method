import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name Student: ");
        String input_name = sc.nextLine();
        boolean check = false;
        String[] arr = {"An", "Thanh", "Lan", "Hương"};

        for (int i=0; i < arr.length; i++) {
            if(arr[i].equals(input_name)) {
                System.out.println("Position of the students "+ input_name +" in the list is: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found" + input_name + " in the list.");
        }

    }
}
