class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;
        long volume = (long) length * width * height;

        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) {
            bulky = true;
        }

        if (mass >= 100) {
            heavy = true;
        }

        if (heavy && bulky) {
            return "Both";
        }
        else if (heavy && !bulky) {
            return "Heavy";
        }
        else if (!heavy && bulky){
            return "Bulky";
        }
        else {
            return "Neither";
        }
    }
}