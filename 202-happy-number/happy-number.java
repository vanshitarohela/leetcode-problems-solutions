class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> set = new ArrayList<Integer>();
        while (true) {
            n = numSquare(n);
            if (n == 1){
                return true;
            }
            else {
                if (set.contains(n)){
                    return false;
                }
            }
            set.add(n);
        }
    }

    public int numSquare(int n) {
        int total = 0;
        while (n > 0) {
            total += (n%10) * (n%10);
            n /= 10;
        }
        return total;
    }
}