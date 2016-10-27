public class SieveOfEratosthenes {


    public static void main(String[] args) {
        int testNumber = 9991055;
        boolean[] composite = doSieve(testNumber);
        for(int i = 2; i < composite.length; i++) {//start index at 2 as 2 is the smallest prime
            if(!composite[i])
                System.out.println(i);
        }
    }
    
    /*input limit: square root of number to find prime factors of
    return: array of booleans where false means index is a prime*/
    public static boolean[] doSieve(int limit) {
        boolean[] composite  = new boolean[limit];//boolean arrays are intialized to false, so at start assume no numbers are composite
        composite[0] = composite [1] = true;//The numbers 0 and 1 are special cases and are considered composite
        
        /*optimization: check for multiples of 2 here so can focus only on odds latter*/
        for(int i = 2; i < limit; i += 2) {
            composite[i] = true;
        }
        
        for(int i = 3; i < Math.ceil(Math.sqrt(limit)); i += 2) {
            if(!composite[i]) {
                for(int j = i*i; j < limit; j += i) {
                    composite[j] = true;//found a composite number
                }
            }
        }
        
        return composite;
    }
    
}
