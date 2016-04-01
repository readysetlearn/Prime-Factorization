package primefactorization;

import java.util.ArrayList;


public class PrimeFactorization {


    public static void main(String[] args) {
        int test = 1001;
        ArrayList<Integer> factors = factor(test);
        for(Integer i : factors) {
            System.out.println(i);
        }
    }
    
    /*factor input into its prime compisition*/
    public static ArrayList<Integer> factor(int input) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        while(input %2 == 0) {//since 2 is factored out at this step, consider removing the check for it in isPrime()
            input /= 2;
            factors.add(2);
        }
        
        for(int i = 3; i <= Math.floor(Math.sqrt(input)); i += 2) {
            while(input % i == 0) {
                input /= i;
                factors.add(i);
            }
            if(isPrime(input)) {
                factors.add(input);//remainder is prime so we're done
                return factors;
            }
        }
        return null;
    }
    
    /*return true iff input is prime*/
    public static boolean isPrime(int input) {
        if(input == 2) {//2 is a special case
            return true;
        }
        
        if(input % 2 == 0) {
            return false;
        }

        for(int i = 3; i <= Math.floor(Math.sqrt(input)); i += 2) {       
            if(input % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
