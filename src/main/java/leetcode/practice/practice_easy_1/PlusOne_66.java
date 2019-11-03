package leetcode.practice.practice_easy_1;

import java.util.Arrays;

public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n-1;
        while (i>= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }
        if(i>=0) {
            digits[i]=digits[i]+1;
            return digits;
        }

        int[] res = new int[n+1];
        Arrays.fill(res, 0);
        res[0] = 1;
        return res;
    }
}
