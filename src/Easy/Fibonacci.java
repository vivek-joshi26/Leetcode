// Memoization in Dynamic Programming and Tabulation
// Fib series : 0,1,1,2,3,5,8.........   f(n) = f(n-1) + f(n-2)
package Easy;

public class Fibonacci {

    // Using normal recursion
    public int fib(int n){

        if( n == 0 || n == 1)
            return n;

        int num = fib(n-1) + fib(n-2);
        return num;
    }

    // Using Memoization, we maintain a separate array and check whether the value for a particular element is already present or not
    public int fibMemo(int n, int[] qb){
        if(n == 0|| n == 1)
            return n;

        if( qb[n] != 0)
            return qb[n];

        int num = fibMemo(n-1,qb) + fibMemo(n-2, qb);
        qb[n] = num;
        return num;
    }

    // Using Tabulation, Tabulation is bottom to top approach, we provide the values for starting positions
    public int fibTabulation(int n){
        int[] tab = new int[n+1];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i <= n; i++){
            tab[i] = tab[i-1] + tab[i-2];
        }
        return tab[n];
    }

    // Using Iteration
    public int fibIteration(int n){
        int a = 0, b = 1;
        if( n == 0 || n == 1)
            return n;
        while( n >= 2){
            int result = a + b;
            a = b;
            b = result;
            n--;
        }
        return b;
    }


    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(10));
        System.out.println(fibonacci.fibMemo(10,new int[11]));
        System.out.println(fibonacci.fibTabulation(10));
        System.out.println(fibonacci.fibIteration(10));

    }
}
