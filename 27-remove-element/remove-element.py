class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i = 0
        j = len(nums) - 1
        k = 0
        while ( i <= j):
            if nums[i] != val:
                i += 1
            else:
                nums[i] = nums[j]
                j -= 1
                k += 1
        return i