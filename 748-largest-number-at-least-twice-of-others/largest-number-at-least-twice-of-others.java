class Solution {
    public int dominantIndex(int[] nums) {
        int m1 = -1, m2 = -2, ind = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > m1) {
                m2 = m1;
                m1 = nums[i];
                ind = i;
            } else if(nums[i] > m2) {
                m2 = nums[i];
            }
        }

        if(m1 >= 2*m2) {
            return ind;
        }
        return -1;
    }
}