//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
// n = 1 ans is 1, n = 2 ans is 2, n = 3 ans is 3, n = 4 ans is 5, n = 5 ans is 8, n = 6 ans is 13
// If we observe closely it is a Fibonacci series getting started from 1
// F(n) = F(n-1) + F(n-2)

package Easy;

public class LT70 {

    // using Fibonacci concept without recursion
    public int climbStairs(int n) {
        if(n == 1 || n == 2)
            return n;
        int first = 1;
        int second = 2;

        for(int i = 3; i <= n; i++){
            int third = second + first;
            first = second;
            second = third;
        }
        return second;
    }


    // using recursion, F(i,n) = F(i+1,n) + F(i+2,n)
    public int climbStairs2(int n) {
        return climbStairs3(0,n);
    }

    public int climbStairs3(int i, int n) {

        if(i > n)
            return 0;
        if(i == n)
            return 1;
        return climbStairs3(i+1,n) + climbStairs3(i+2,n);
    }


    public static void main(String[] args) {
        LT70 newObj = new LT70();
        System.out.println(newObj.climbStairs(6));
        System.out.println(newObj.climbStairs2(6));
    }
}
