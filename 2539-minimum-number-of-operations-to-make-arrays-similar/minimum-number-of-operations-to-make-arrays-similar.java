class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        List<Integer> nodd = new ArrayList<>();
        List<Integer> neven = new ArrayList<>();
        List<Integer> todd = new ArrayList<>();
        List<Integer> teven = new ArrayList<>();

        for (int i = 0; i < target.length; i++) {
            if (target[i] % 2 == 1) {
                todd.add(target[i]);
            } else {
                teven.add(target[i]);
            }
            if (nums[i] % 2 == 1) {
                nodd.add(nums[i]);
            } else {
                neven.add(nums[i]);
            }
        }

        Collections.sort(nodd);
        Collections.sort(todd);
        Collections.sort(neven);
        Collections.sort(teven);

        long ans = 0;
        for (int i = 0; i < nodd.size(); i++) {
            ans += Math.abs(nodd.get(i) - todd.get(i)) / 2;
        }
        for (int i = 0; i < neven.size(); i++) {
            ans += Math.abs(neven.get(i) - teven.get(i)) / 2;
        }

        return ans / 2;
    }
}