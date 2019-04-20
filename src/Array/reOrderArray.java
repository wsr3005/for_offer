package Array;

import java.util.Deque;
import java.util.Queue;

/**
 * @program: offer
 * @description: reorder array
 * @author: Mr.Q
 * @create: 2019-04-18 21:14
 **/
public class reOrderArray {
    public void reOrderArray(int[] array) {
        int N = array.length;
        int k = 0;
        for (int i = 0; i < N; i++) {
            if (array[i]%2 == 1){
                int j = i;
                while (j > k){
                    exch(array,j,j-1);
                    j--;
                }
                k++;
            }
        }
    }

    private static void exch(int[] a,int i ,int j){
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
