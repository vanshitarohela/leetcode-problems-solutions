class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mini = maxi = prices[0]
        total = 0
        for i in prices:
            if i < maxi:
                total += maxi-mini
                mini = maxi = i
            else:
                maxi = i
        return total + maxi - mini
            