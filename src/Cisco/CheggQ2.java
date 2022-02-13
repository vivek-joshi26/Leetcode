package Cisco;

public class CheggQ2 {
    public int solution(int N, int K) {
        // write your code in Java SE 8
        // If the sum of capacity of all glasses is less than K
        // then we will return -1
        long totalCapacity = (N*(N+1))/2;
        int minCount = 0;
        if(totalCapacity < K){
            return -1;
        }
        else{
            // start with the highest capacity glass i.e. N
            // go down by one each time like N-1, N-2 ......
            // once the current amount of water remaning (Let's say x) is less than N-i(current glass capacity)
            // use glass of x capacity directly
            int i = 0;
            while(N-i <= K && K!=0){
                K = K - (N-i);
                i++;
                minCount++;
            }
            if(K!=0){        // we will directly use a glass with capacity K as (K<N-i) from previous loop
                minCount++;
            }
        }
        // returning the minimum count of glass required for K litres of water.
        return minCount;
    }
}
