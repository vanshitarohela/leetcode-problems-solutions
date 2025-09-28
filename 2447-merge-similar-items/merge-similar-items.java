class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> ans = new TreeMap<>();
        for(int i = 0; i < items1.length; i++) {
            if(ans.containsKey(items1[i][0])) {
                ans.put(items1[i][0], ans.get(items1[i][0]) + items1[i][1]);
            } else {
                ans.put(items1[i][0], items1[i][1]);
            }
        }
        // for(List<Integer> pair: items1) {
            // if(ans.containsKey(pair.get(0))) {

            // }
            // if(!ans.get(pair.get(0))) {
            //     ans.put(pair.get(0), ans.get(pair.get(0)) + pair.get(1));
            // } else {
            //     ans.put(pair.get(0), pair.get(1));
            // }
        // }

        for(int i = 0; i < items2.length; i++) {
            // if(ans.containsKey(pair.get(0))) {

            // }
            if(ans.containsKey(items2[i][0])) {
                ans.put(items2[i][0], ans.get(items2[i][0]) + items2[i][1]);
            } else {
                ans.put(items2[i][0], items2[i][1]);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> entrySet = ans.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            res.add(new ArrayList<Integer>(List.of(entry.getKey(), entry.getValue())));
            // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        return res;
    }
}