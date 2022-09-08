import java.util.Arrays;

public class MaxTwoArray {
    public static void main(String[] args) {
        int arr[][] = {{2,5,4}, {3,7,4}, {5,9,8}};
        int max = arr[0][0];
        for (int i=0 ; i < arr.length; i++) {
            for (int j=0; j < arr.length; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Element max is: " + max);
    }
}
