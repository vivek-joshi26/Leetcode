package Easy;
// Find Numbers with Even Number of Digits

public class LT1295 {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums
             ) {
            int even = 0;
            while (n > 0){
                n = n /10;
                even++;
            }

            if(even % 2 == 0 && even != 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        LT1295 lt1295 = new LT1295();
        int[] arr = {555,901,482,1771};
        System.out.print(lt1295.findNumbers(arr));
    }

}
