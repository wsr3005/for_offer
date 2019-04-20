package LinkedList;

/**
 * @program: offer
 * @description: Enter two monotonically increasing linked lists and output the linked list of the two linked lists.
 * Of course, we need the synthesized linked list to satisfy the monotonous and undecreasing rules.
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * @author: Mr.Q
 * @create: 2019-04-19 09:14
 **/
public class Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode newHead = null;
        if (list1.val <= list2.val){
            newHead = list1;
            newHead.next = Merge(list1.next,list2);
        }else {
            newHead = list2;
            newHead.next = Merge(list1,list2.next);
        }
        return newHead;
    }
}
