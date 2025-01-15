class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        arr = [0] * 26
        for char in s:
            arr[ord(char) - ord('a')] += 1
        for char in t:
            arr[ord(char) - ord('a')] -= 1
        for i in arr:
            if i != 0:
                return False
        return True

        # freq = dict()
        # for char in s:
        #     freq[char] = freq.get(char, 0) + 1
        # for char in t:
        #     freq[char] = freq.get(char, 0) - 1
        # for key in freq:
        #     if freq.get(key, 0) != 0:
        #         return False
        # return True
        # ******** 11
        # ms
        # Beats
        # 74.86%


