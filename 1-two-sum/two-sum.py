class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        visited = dict()
        for ind in range(len(nums)):
            if target - nums[ind] in visited:
                return [visited[target-nums[ind]], ind]
            visited[nums[ind]] = ind