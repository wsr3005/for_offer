package LinkedList;

/**
 * @program: offer
 * @description:
 * @author: Mr.Q
 * @create: 2019-04-18 23:41
 **/
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k){
        if (head == null || k <= 0)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        while(k-- > 1) {
            if (fast.next != null)
                fast = fast.next;
            else
                return null;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


//    public static void main(String[] args){
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(7);
//        FindKthToTail fktt = new FindKthToTail();
//        System.out.println(fktt.FindKthToTail(head,2).val);
//
//    }
}
