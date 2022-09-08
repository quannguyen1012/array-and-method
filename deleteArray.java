import java.util.Arrays;

public class deleteArray {
    public static void main(String[] args) {
        int[] n = {1,5,2,34,63,73,7,34};
        int x = 63;
        int index = 0;
        for (int i=0; i < n.length; i++) {
            if(x == n[i]) {
                break;
            }
            index++;
        }

        for (int i = index; i < n.length; i++) {
            if (i == n.length - 1) {
                n[i] = 0;
                break;
            }
            n[i] = n[i + 1];
        }
        System.out.println(Arrays.toString(n));
    }
}
