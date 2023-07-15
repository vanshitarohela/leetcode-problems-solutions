class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        length = len(nums)
        maxSum = nums[0]
        current = 0

        for i in nums:
            if current < 0:
                current = 0
            current += i
            maxSum = max(maxSum, current)
        return maxSum