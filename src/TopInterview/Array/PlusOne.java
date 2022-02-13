package TopInterview.Array;

import java.util.LinkedList;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        LinkedList<Integer> list = new LinkedList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--){
            int cur = digits[i] + carry;
            if(cur > 9){
                carry = cur/10;
                cur = cur % 10;
            }
            else
                carry = 0;
            list.add(cur);
        }

        if(carry > 0)
            list.add(carry);

        int[] result = new int[list.size()];
        for (int i = result.length - 1; i >= 0; i--){
            result[i] = list.pollFirst();
        }
        return result;

    }

    // doing in place
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;

    }


}
