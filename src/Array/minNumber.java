package Array;

/**
 * @program: offer
 * @description: the smallest number of Rotating arrays
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author: Mr.Q
 * @create: 2019-04-18 17:53
 **/
public class minNumber {
    public int minNumberInRotateArray(int [] array) {
        sort(array);
        return array[0];
    }
    private static boolean less(int v,int w){
        return compare(v,w) < 0;
    }

    private static void exch(int[] a,int i ,int j){
        Integer swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    public static void sort(int[] array){
        int N = array.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--){
                if (less(array[j],array[j-1]))
                    exch(array,j,j-1);
                else break;
            }
        }
    }
    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}
