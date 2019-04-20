package Stack;

import java.util.Stack;

/**
 * @program: offer
 * @description: Implement a queue with two stacks
 * @author: Mr.Q
 * @create: 2019-04-18 17:38
 **/
public class queueDefinedByStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }
    //栈1出栈元素压入栈2，栈2出栈，效果等同于队列的出队
    public int pop() throws Exception{
        if (stack1.isEmpty() && stack2.isEmpty())
            throw new Exception("the stack is empty!");

        if (stack2.isEmpty()){
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }

        return stack2.pop();
    }
}
