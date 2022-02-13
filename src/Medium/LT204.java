package Medium;

//Given an integer n, return the number of prime numbers that are strictly less than n.

public class LT204 {

    //bruteforce n^2
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i) == true)
                count++;
        }
        return count;
    }

    public boolean isPrime(int n){
        if( n < 2)
            return false;
        /*
        for(int i = 2; i <= n/2; i++)
            if (n % i == 0)
                return false;

         */
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }
            return true;
    }


    // Using array to update the prime multiples values
    public int countPrimes2(int n) {
        if(n < 2)
            return 0;
        boolean[] check = new boolean[n];
        int count = 0;
        for(int i = 2; i * i < n; i++){
            if( check[i] != true){
                for(int j = i + i; j < n; j = j + i){
                    check[j] = true;
                }
            }
        }
        for( int i = 2; i < n; i++){
            if(check[i] != true)
                count++;
        }
        return count;
    }



    public static void main(String[] args) {
        LT204 lt204 = new LT204();
        System.out.println(lt204.isPrime(11));
        System.out.print(lt204.countPrimes2(3));
    }

}
