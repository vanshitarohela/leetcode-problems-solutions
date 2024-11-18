class Solution:
    def canJump(self, nums: List[int]) -> bool:
        max_ind = i = 0
        length = len(nums)
        while i <= min(max_ind, length-1):
            max_ind = max(max_ind, nums[i]+i)
            i += 1
            if(max_ind >= length-1):
                return True
        return False