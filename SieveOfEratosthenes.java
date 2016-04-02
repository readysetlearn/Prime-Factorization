public class SieveOfEratosthenes {


    public static void main(String[] args) {
        int test = 10013;
        int sqrt = (int)Math.floor(Math.sqrt(10013));
    }
    
    /*input limit: square root of number to find prime factors of*/
    public static void doSieve(int limit) {
        boolean[] primes  = new boolean[limit];
        for(int i = 2; i < limit; i++) {
            for(int j = 1; i * j  < limit; j++) {
                primes[j] = true;//default value of boolean array is false
            }
        }
    }
    
}
