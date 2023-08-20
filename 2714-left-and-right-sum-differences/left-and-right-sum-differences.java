class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int[] sum = new int[n];

        for (int j = 0; j < n; j++) {
            if (j == 0) {
                sum[0] = nums[0];
            }
            else {
                sum[j] = nums[j] + sum[j-1];
            }
        }

        int i = 0;

        while (i < n) {
            if (i == 0) {
                arr[i] = sum[n-1] - nums[i];
            }
            else if (i == n-1) {
                arr[i] = sum[n-2];
            }
            else {
                arr[i] = Math.abs((sum[n-1] - sum[i]) - sum[i-1]);
            }
            i += 1;
        }

        return arr;
    }

}