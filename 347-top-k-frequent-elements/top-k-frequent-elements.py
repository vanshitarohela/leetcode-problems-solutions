class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if k == 0:
            return []
        freq = dict()
        arr = []
        for i in nums:
            if i in freq:
                freq[i] = freq[i] + 1
            else:
                freq[i] = 1
        # sort dict by value
        freq = dict(sorted(freq.items(), key=lambda x:x[1], reverse=True))
        for key in freq:
            arr.append(key)
            k -= 1
            if k == 0:
                return arr