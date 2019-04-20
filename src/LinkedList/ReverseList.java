package LinkedList;

/**
 * @program: offer
 * @description: Enter a linked list, and after inverting the linked list,
 * output the header of the new linked list.
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author: Mr.Q
 * @create: 2019-04-19 00:05
 **/
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
