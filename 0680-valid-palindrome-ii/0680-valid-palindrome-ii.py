class Solution:
    def palindrome(self, s):
        low = 0
        high = len(s) - 1
        while low <= high:
            if s[low] != s[high]:
                return False
            else:
                low += 1
                high -= 1
        return True


    def validPalindrome(self, s: str) -> bool:
        low = 0
        high = len(s) - 1

        while low <= high:
            if s[low] == s[high]:
                low += 1
                high -= 1

            else:
                if self.palindrome(s[low:high]):
                    return True
                elif self.palindrome(s[low+1:high+1]):
                    return True
                else:
                    return False
        return True