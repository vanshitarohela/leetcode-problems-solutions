class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while(i > -1 && digits[i] == 9) {
            digits[i] = 0;
            i -= 1;
        }
        if(i > -1) {
            digits[i] += 1;
        } else {
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }
}