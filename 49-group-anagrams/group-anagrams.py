class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        visit = dict()
        res = []
        for orig in strs:
            string = ''.join(sorted(orig))
            if string not in visit:
                visit[string] = [orig]
            else:
                visit[string].append(orig)
        for key in visit:
            res.append(visit[key])
        return res