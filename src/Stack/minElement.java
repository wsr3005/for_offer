package Stack;

import java.util.Stack;

/**
 * @program: offer
 * @description: To define the data structure of the stack,
 * implement a min function in this type that will get the smallest element contained in the stack
 * @author: Mr.Q
 * @create: 2019-04-19 21:48
 **/
public class minElement {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int node) {
        data.push(node);
        if (min.isEmpty()) {
            min.push(node);
        }else {
            if (min.peek() > node) {
                min.push(node);
            }
        }
    }

    public void pop() {
        if (data.pop() == min.peek())
            min.pop();
//        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
