class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 0
        for i in range(-1, -len(digits)-1, -1):
            if digits[i] == 9:
                digits[i] = 0
                carry = 1
            elif carry == 1:
                digits[i] += 1
                carry = 0
                break
            else:
                digits[-1] += 1
                carry = 0
                break
        if carry == 1:
            digits.insert(0, 1)
        return digits        