class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        } else if (rowIndex == 1) {
            return List.of(1, 1);
        } else {
            List<Integer> arr = new ArrayList<Integer>(List.of(1,1));
            List<Integer> temp = new ArrayList<Integer>();
            System.out.println(arr);
            for(int i = 2; i <= rowIndex; i++) {
                temp.add(1);
                for(int j = 1; j < i; j++) {
                    System.out.println(arr);
                    temp.add(arr.get(j-1) + arr.get(j));
                }
                temp.add(1);
                // arr = temp;
                // temp.clear();

                arr = new ArrayList<>(temp);
                temp.clear();

                // arr = temp;
                // temp = new ArrayList<>();
            }

            return arr;
        }
    }
}