// Program
import java.util.*;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int num : pushed) {
            stack.push(num);

            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}

Accepted
Runtime: 0 ms
Case 1
Case 2
Input
pushed = [1,2,3,4,5]
popped = [4,5,3,2,1]
Output : true
Expected : true
