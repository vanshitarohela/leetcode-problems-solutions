class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s = set(nums)
        max_seq = 0

        while len(s) != 0:
            for i in s:
                x = y = i
                s.remove(i)
                break
            while x - 1 in s:
                x = x - 1
                s.remove(x)
            while y + 1 in s:
                y = y + 1
                s.remove(y)
            max_seq = max(max_seq, y-x+1)
        return max_seq
            