class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for(int i = temperatures.length-1; i>=0; i--) {
            while (!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                ans[i] = s.peek() - i;
                s.push(i);
            } else {
                ans[i] = 0;
                s.push(i);
            }
        }
    // for(int i = temperatures.length-1; i>=0; i--) {
    //     if (s.isEmpty()) {
    //         ans[i] = 0;
    //         s.push(i);
    //     } else {
    //         if (temperatures[s.peek()] > temperatures[i]) {
    //             ans[i] = s.peek()-i;
    //             s.push(i);
    //         } else {
    //             while (!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]) {
    //                 s.pop();
    //             }
    //             if (!s.isEmpty()) {
    //                 ans[i] = s.peek() - i;
    //                 s.push(i);
    //             } else {
    //                 ans[i] = 0;
    //                 s.push(i);
    //             }
    //         }
    //     }
    // }
    return ans;
}}