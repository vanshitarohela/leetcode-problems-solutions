class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        int prev;
        for (int i = arr.length-1; i >= 0; i--){
            prev = arr[i];
            if (i == arr.length-1) {
                arr[i] = -1;
            }
            else {
                prev = arr[i];
                arr[i] = max;
                if (prev > max) {
                    max = prev;
                }
            }
        }
        return arr;
    }
}