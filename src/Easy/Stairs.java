//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
/*
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

n = 2
1
2
 */
package Easy;

public class Stairs {

    // normal recursion
    public int climbStairs(int n) {
        if( n == 0)
            return 1;
        else if( n < 0)
            return 0;
        int total = climbStairs(n-1) + climbStairs(n-2);
        return total;
    }

    // using memoization
    public int climbStairsMemo(int n, int[] qb) {
        if( n == 0)
            return 1;
        else if( n < 0)
            return 0;
        else if( qb[n] != 0)
            return qb[n];
        int total = climbStairsMemo(n-1,qb) + climbStairsMemo(n-2,qb);
        qb[n] = total;
        return total;
    }

    // using tabulation
    public int climbStairsTabu(int n){

        int[] qb = new int[n+1];
        qb[0] = 1;
        for( int i = 1; i <= n ; i++){
            if( i == 1)
                qb[i] = qb[i-1];
            else{
                qb[i] = qb[i-1] + qb[i-2];
            }
        }
        /*
        qb[1] = 1;
        qb[2] = 2;
        for( int i = 3; i <= n ; i++){
            qb[i] = qb[i-1] + qb[i-2];
        }
         */
        return qb[n];
    }

    public static void main(String[] args) {
        Stairs stairs = new Stairs();
        System.out.println(stairs.climbStairs(10));
        System.out.println(stairs.climbStairsTabu(10));
        System.out.println(stairs.climbStairsMemo(10,new  int[11]));
    }
}
