// Program
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = null;

        for (ListNode list : lists) {
            result = merge(result, list);
        }

        return result;
    }

    private ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (a != null && b != null) {
            if (a.val <= b.val) {
                current.next = a;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }

        current.next = (a != null) ? a : b;

        return dummy.next;
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
lists = [[1,4,5],[1,3,4],[2,6]]
Output : [1,1,2,3,4,4,5,6]
Expected : [1,1,2,3,4,4,5,6]
