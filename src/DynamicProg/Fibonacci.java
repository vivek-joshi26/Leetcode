package DynamicProg;


// 0    1   1   2   3   5   8
public class Fibonacci {

    public int fib(int n) {

        if(n == 0 )
            return 0;
        if(n == 1)
            return 1;
        int a = 0, b = 1, c = 1;
        for (int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;

    }

    // using recursion
    public int fib1(int n) {
        if(n == 0 )
            return 0;
        if(n == 1)
            return 1;
        return fib1(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib1(4));
    }

}
