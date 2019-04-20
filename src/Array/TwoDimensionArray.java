package Array;

/**
 * @program: offer
 * @description: search
 * @author: Mr.Q
 * @create: 2019-04-18 15:02
 **/
public class TwoDimensionArray {
    public boolean Find(int target, int [][] array) {
        if (array == null)
            return false;

        int row = 0;
        int col = array[0].length - 1;

        while (row < array.length && col >= 0){
            if (target == array[row][col]){
                return true;
            }
            if (target < array[row][col]){
                col--;
            }else
                row++;
        }
        return false;
    }
}
