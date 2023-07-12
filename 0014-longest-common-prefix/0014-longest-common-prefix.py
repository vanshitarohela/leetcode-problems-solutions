class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        i = 0
        res = ""
        mini = len(strs[0])
        for j in strs:
            if len(j) < mini:
                mini = len(j)

        while i < mini:
            char = strs[0][i]
            for j in strs:
                if j[i] != char:
                    return res
                else:
                    continue
            res += char
            i += 1
        return res