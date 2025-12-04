class Solution {
    // int total = 0;
    public int climbStairs(int n) {
        // int total = 0;
        int[] cache = new int[n+1];
        return rec(0, n, cache);
        // return rec(0, n);
        // return total;
    }

    // public int rec(int curr, int target) {
    //     if(curr > target) {
    //         return 0;
    //     }
    //     if(curr == target) {
    //         return 1;
    //     }
    //     // int total = 0;
    //     // if(cache[curr] != 0) {
    //     //     return cache[curr];
    //     // }
    //     total += rec(curr+1, target);
    //     total += rec(curr+2, target);
    //     return total;
    // }

    public int rec(int curr, int target, int[] cache) {
        if(curr > target) {
            return 0;
        }
        if(curr == target) {
            return 1;
        }
        if(cache[curr] != 0) {
            return cache[curr];
        }
        int total = 0;
        total += rec(curr+1, target, cache);
        total += rec(curr+2, target, cache);
        cache[curr] = total;
        return total;
    } 
}