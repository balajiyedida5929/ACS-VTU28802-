// Program:
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def diameterOfBinaryTree(self, root):
        diameter = [0]

        def height(node):
            if node is None:
                return 0

            left = height(node.left)
            right = height(node.right)

            diameter[0] = max(diameter[0], left + right)

            return 1 + max(left, right)

        height(root)
        return diameter[0]
Accepted
Runtime: 0 ms
Case 1
Case 2
Input
root =
[1,2,3,4,5]
Output
3
Expected
3
