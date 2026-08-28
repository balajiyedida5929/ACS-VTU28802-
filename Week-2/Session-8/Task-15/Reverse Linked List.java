// Program
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        // Empty list or single node
        if (head == nullptr || head->next == nullptr) {
            return head;
        }

        ListNode* newHead = reverseList(head->next);

        // Put current node after its next node
        head->next->next = head;
        head->next = nullptr;

        return newHead;
    }
};
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
head = [1,2,3,4,5]
Output : [5,4,3,2,1]
Expected : [5,4,3,2,1]
