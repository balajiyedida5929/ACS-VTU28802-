// Program
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
                result.append(c);
            } else if (c == ')') {
                if (balance > 0) {
                    balance--;
                    result.append(c);
                }
            } else {
                result.append(c);
            }
        }

        for (int i = result.length() - 1; i >= 0 && balance > 0; i--) {
            if (result.charAt(i) == '(') {
                result.deleteCharAt(i);
                balance--;
            }
        }

        return result.toString();
    }
}

Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
s = "lee(t(c)o)de)"
Output : "lee(t(c)o)de"
Expected : "lee(t(c)o)de"
