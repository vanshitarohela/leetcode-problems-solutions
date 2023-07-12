class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        nee = len(needle)
        hay = len(haystack)

        for i in range(hay + 1 - nee):
            # high = i + nee
            # if high > hay:
            #     return -1
            # else:
            for j in range(nee):
                if haystack[i + j] != needle[j]:
                    break
                if j == nee - 1:
                    return i
        return -1
            