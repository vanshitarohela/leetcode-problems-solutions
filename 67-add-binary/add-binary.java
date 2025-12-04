class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();

        char[] arr = new char[l1 > l2 ? l1+1 : l2+1];

        char carry = '0';

        int i1 = l1-1;
        int i2 = l2-1;
        int arr_ind = l1>l2 ? l1 : l2;
        while(i1>=0 && i2>=0) {
            if(a.charAt(i1) == '1' && b.charAt(i2) == '1') {
                if(carry == '1') {
                    arr[arr_ind] = '1';
                } else {
                    arr[arr_ind] = '0';
                    carry = '1';
                }
            } else if(a.charAt(i1) == '0' && b.charAt(i2) == '0') {
                if(carry == '1') {
                    arr[arr_ind] = '1';
                    carry = '0';
                } else {
                    arr[arr_ind] = '0';
                }
            } else {
                if(carry == '1') {
                    arr[arr_ind] = '0';
                } else {
                    arr[arr_ind] = '1';
                }
            }
            i1 -= 1;
            i2 -= 1;
            arr_ind -= 1;
        }
        
        while(i1>=0) {
            if(a.charAt(i1) == '1') {
                if(carry == '1') {
                    arr[arr_ind] = '0';
                } else {
                    arr[arr_ind] = '1';
                }
            } else {
                if(carry == '1') {
                    arr[arr_ind] = '1';
                    carry = '0';
                } else {
                    arr[arr_ind] = '0';
                }
            }
            i1 -= 1;
            arr_ind -= 1;
        }

        while(i2>=0) {
            if(b.charAt(i2) == '1') {
                if(carry == '1') {
                    arr[arr_ind] = '0';
                } else {
                    arr[arr_ind] = '1';
                }
            } else {
                if(carry == '1') {
                    arr[arr_ind] = '1';
                    carry = '0';
                } else {
                    arr[arr_ind] = '0';
                }
            }
            i2 -= 1;
            arr_ind -= 1;
        }

        if(carry == '1') {
            arr[0] = '1';
        } else {
            arr[0] = '0';
        }
        String ans = new String(arr);
        if(arr[0] == '0') {
            ans = ans.substring(1);
        }
        return ans;
    }
}