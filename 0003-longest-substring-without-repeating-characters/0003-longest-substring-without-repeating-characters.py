class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        res = 0
        lis = []

        for r in range(len(s)):
            while s[r] in lis:
                lis.remove(s[l])
                l += 1
            lis.append(s[r])
            res = max(res, len(lis))
        return res