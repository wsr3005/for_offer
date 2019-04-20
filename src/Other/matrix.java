package Other;

import java.util.ArrayList;

/**
 * @program: offer
 * @description: Clockwise printing matrix
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * 则依次打印出数字
 * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author: Mr.Q
 * @create: 2019-04-19 20:24
 **/
public class matrix {
    public ArrayList<Integer> printMatrix(int[][] matrix){
        if (matrix == null)
            return null;
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int startXY = 0;
        while (col - 1 > 2*startXY && row - 1 > 2*startXY){
            int endX = col - startXY - 1;
            int endY = row - startXY - 1;
            //from left to right
            for (int i = startXY; i <= endX; i++) {
                list.add(matrix[startXY][i]);
            }
            //from top to bottom
            if (startXY < endY){
                for (int i = startXY + 1; i <= endY; i++) {
                    list.add(matrix[i][endX]);
                }
            }
            //from right to left
            if (startXY < endX && startXY < endY){
                for (int i = endX - 1; i >= startXY; i--) {
                    list.add(matrix[endY][i]);
                }
            }
            //from bottom to  top
            if (startXY < endX && startXY < endY - 1){
                for (int i = endY - 1; i >= startXY + 1; i--)
                    list.add(matrix[i][startXY]);
            }
            startXY++;
        }
        return list;
    }

}
