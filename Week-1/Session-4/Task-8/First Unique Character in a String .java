// Program
class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}

Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
s = "leetcode"
Output : 0
Expected : 0
