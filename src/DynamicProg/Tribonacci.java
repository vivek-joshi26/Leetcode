package DynamicProg;

public class Tribonacci {
    public int tribonacci(int n) {
        if(n <= 1)
            return n;
        if(n == 2)
            return 1;
        int n1 = 0, n2 = 1, n3 = 1, cur = 0;

        for(int i = 3; i <= n; i++){
            cur = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = cur;
        }
        return cur;

    }


}
