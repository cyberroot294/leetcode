public class mergeTwoSortedList {

    // submit this method to the leetcode, apart from this method, they're used for tests only
    // i use recursion to merging the two linked list 
    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) { // this will run if one of two list is null, if list 1 is null, you just should take the list 2 to the rest of your result linked list
            return l2;
        } else if (l2 == null) { // this will run if one of two list is null, if list 2 is null, you just should take the list 1 to the rest of your result linked list
            return l1;
        } else if(l1.val < l2.val) { // check if value of l1 is smaller than l2, so 
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    // 1 3 4 6 7
    // 2 4 5 6

    public static void main(String[] args) {
        
        // Linked List 1
        ListNode l1_5 = new ListNode(7);
        ListNode l1_4 = new ListNode(6, l1_5);
        ListNode l1_3 = new ListNode(4, l1_4);
        ListNode l1_2 = new ListNode(3, l1_3);
        ListNode l1_1 = new ListNode(1, l1_2);

        // Linked List 2
        ListNode l2_4 = new ListNode(6);
        ListNode l2_3 = new ListNode(5, l2_4);
        ListNode l2_2 = new ListNode(4, l2_3);
        ListNode l2_1 = new ListNode(2, l2_2);
        
        // Result
        ListNode result = merge(l1_1, l2_1);
        ListNode head = result;
        while (head != null) {
            System.out.printf("%s ", head.val);
            head = head.next;
        }
        System.out.println();
    }
}

/**
 * ListNode
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
