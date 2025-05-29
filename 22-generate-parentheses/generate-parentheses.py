class Solution:
    def addParenthesis(self, openP, closeP, s, arr):
        # if openP == closeP == 0:
        #     return s
        if openP == 0:
            while closeP != 0:
                s += ')'
                closeP -= 1
            arr.append(s)
            return
        if openP == closeP:
            # s += '('
            self.addParenthesis(openP-1, closeP, s+'(', arr)
        if openP < closeP:
            self.addParenthesis(openP-1, closeP, s+'(', arr)
            self.addParenthesis(openP, closeP-1, s+')', arr)

    def generateParenthesis(self, n: int) -> List[str]:
        openP = closeP = n
        arr = []
        
        self.addParenthesis(openP, closeP, '', arr)
        return arr