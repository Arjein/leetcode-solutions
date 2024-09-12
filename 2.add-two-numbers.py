#
# @lc app=leetcode id=2 lang=python3
#
# [2] Add Two Numbers
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
        
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        current = dummy
        carry = 0
        
        while l1 or l2 or carry is 1:
            value = (l1.val if l1 else 0) + (l2.val if l2 else 0)
            if carry > 0:
                value += carry
                carry = 0
            if value >= 10:
                carry =  value // 10
                value = value % 10
            current.next = ListNode(value, None)
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            current = current.next
        
        return dummy.next
                

# @lc code=end

