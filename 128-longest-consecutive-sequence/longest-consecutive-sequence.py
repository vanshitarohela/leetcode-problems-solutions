class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s = set(nums)
        max_seq = 0

        for i in s:
            if i-1 not in s:
                seq = 0
                while i + seq in s:
                    seq += 1
                max_seq = max(max_seq, seq)
        return max_seq


        # while len(s) != 0:
        #     for i in s:
        #         x = y = i
        #         s.remove(i)
        #         break
        #     while x - 1 in s:
        #         x = x - 1
        #         s.remove(x)
        #     while y + 1 in s:
        #         y = y + 1
        #         s.remove(y)
        #     max_seq = max(max_seq, y-x+1)
        # return max_seq            