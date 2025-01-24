class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        i = 0
        while i < len(nums):
            if i > 0 and nums[i] == nums[i-1]:
                i += 1
                continue
            j = i + 1
            k = len(nums) - 1
            target = 0 - nums[i]
            while j < k:
                ss = nums[j] + nums[k]
                if ss == target:
                    res.append([nums[i], nums[j], nums[k]])
                    while j < len(nums)-1 and nums[j] == nums[j+1]:
                        j += 1
                    while k > j and nums[k] == nums[k-1]:
                        k -= 1
                    j += 1
                    k -= 1
                elif ss < target:
                    j += 1
                else:
                    k -= 1
            i += 1
        return res