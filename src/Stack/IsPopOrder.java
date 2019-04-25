package Stack;

import java.util.Stack;

/**
 * @program: offer
 * @description: 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * @author: Mr.Q
 * @create: 2019-04-25 21:29
 **/
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA){
        if (pushA.length == 0 || popA.length == 0)
            return false;

        Stack<Integer> stack = new Stack<>();
        int count = 0 ;

        for (int i = 0;i < popA.length;i++){
            stack.push(pushA[i]);
            while (!stack.isEmpty() && count < popA.length && stack.peek() == popA[count]){
                stack.pop();
                count++;
            }
        }
        if (stack.isEmpty() && count == popA.length )
            return true;
        return false;

    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        IsPopOrder ipo = new IsPopOrder();

        System.out.println(ipo.IsPopOrder(pushA,popA));
    }
}
