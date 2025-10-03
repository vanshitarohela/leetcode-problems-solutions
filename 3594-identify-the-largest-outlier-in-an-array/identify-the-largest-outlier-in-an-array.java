class Solution {
    public int getLargestOutlier(int[] nums) {
        int total = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            total += i;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(total);

        int loop = 0;
        int ans = -1001;
        for(int i = 0; i < nums.length; i++) {
            loop = total - nums[i];
            if(loop % 2 == 0) {
                if(map.containsKey(loop/2)) {
                    if(loop/2 != nums[i]) {
                        ans = Math.max(ans, nums[i]);
                    } else if(map.get(loop/2) > 1) {
                        ans = Math.max(ans, nums[i]);
                    }
                }
                // if((loop / 2 == nums[i] && map.get(loop/2) > 1)  map.containsKey(loop / 2)) {
                // // if(set.contains(loop/2)) {
                //     ans = Math.max(ans, nums[i]);
                // }
            }
        }

        // Arrays.sort(nums);

        // int loop;
        // int ans = -1001;
        // int i = 0;
        // for(int j = nums.length - 1; j > 0; j--){
        //     for(i = 0; i < j; i++) {
        //         loop = total - nums[i] - nums[j];
        //         if(loop == nums[i]) {
        //             // ans = Math.max(ans, nums[j]);
        //             return nums[j];
        //         } else if(loop == nums[j]) {
        //             ans = Math.max(ans, nums[i]);
        //         }
        //     }
        // }
        // for(int i = 0; i < nums.length; i++) {
        //     loop = 0;
        //     for(int j = i+1; j < nums.length; j++) {
        //         loop = total - nums[i] - nums[j];
        //         if(loop == nums[i]) {
        //             ans = Math.max(ans, nums[j]);
        //         } else if(loop == nums[j]) {
        //             ans = Math.max(ans, nums[i]);
        //         }
        //     }
        // }

        return ans;
    }
}