class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        freq = dict()
        for char in s:
            freq[char] = freq.get(char, 0) + 1
        for char in t:
            freq[char] = freq.get(char, 0) - 1
        for key in freq:
            if freq.get(key, 0) != 0:
                return False
        return True