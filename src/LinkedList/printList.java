package LinkedList;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @program: offer
 * @description: From Tail To Head
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @author: Mr.Q
 * @create: 2019-04-18 15:43
 **/
public class printList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //声明一个ArrayList，用来存放反序的链表节点
        ArrayList<Integer> list = new ArrayList<>();
        //节点为空时，返回list
        if (listNode == null)
            return list;
        //声明一个stack，利用其先进后出的特点将listnode转入到list
        Stack<ListNode> stack = new Stack<>();
        //节点非空，入栈
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        //栈非空，出栈
        while (!stack.isEmpty()){
            list.add(stack.pop().val);
        }

        return list;
    }
}

