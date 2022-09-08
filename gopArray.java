import java.util.Arrays;

public class gopArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,7,23,6};
        int[] arr2 = {1,5,2,62,3};
        int[] arr3 = new int[arr1.length + arr2.length] ;

            int count = 0;
            for (int i = 0; i < arr3.length; i++) {
                if (i < arr1.length) {
                    arr3[i] = arr1[i];
                } else if (i >= arr1.length){
                    arr3[i] = arr2[count];
                    count++;
                }
            }

        System.out.println(Arrays.toString(arr3));
    }
}
