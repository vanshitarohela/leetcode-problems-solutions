// import java.Math.*;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int ans = triangle.get(0).get(0);
        for(int i = 1; i < triangle.size(); i++) {
            ans = Integer.MAX_VALUE;
            for(int j = 0; j < i+1; j++) {
                if(j == 0) {
                    triangle.get(i).set(j, triangle.get(i-1).get(j) + triangle.get(i).get(j));
                } else if (j == i) {
                    triangle.get(i).set(j, triangle.get(i-1).get(j-1) + triangle.get(i).get(j));
                    // ans = Math.min(ans, triangle.get(i).get(j));
                } else {
                    triangle.get(i).set(j, Math.min(triangle.get(i-1).get(j-1) + triangle.get(i).get(j), triangle.get(i-1).get(j) + triangle.get(i).get(j)));
                }
                ans = Math.min(ans, triangle.get(i).get(j));
            }

            // ans = ans;
        }

        return ans;

        // int ind = 0;
        // for(int i = 1; i < triangle.size(); i++) {
        //     if(triangle.get(i).get(ind) < triangle.get(i).get(ind+1)) {
        //         total += triangle.get(i).get(ind);
        //     } else if (triangle.get(i).get(ind) > triangle.get(i).get(ind+1)) {
        //         total += triangle.get(i).get(ind+1);
        //         ind += 1;
        //     } else {
        //         if(i+1 < triangle.size()) {
        //             if(triangle.get(i+1).get(ind) < triangle.get(i+1).get(ind+2)) {
        //                 total += triangle.get(i).get(ind);
        //             } else {
        //                 total += triangle.get(i).get(ind+1);
        //                 ind += 1;
        //             }
        //         } else {
        //             total += triangle.get(i).get(ind);
        //         }
        //     }
        // }

        // return total;
    }
}