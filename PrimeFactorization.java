package primefactorization;


public class PrimeFactorization {


    public static void main(String[] args) {
        int test = 91885987;
        factor(test);
    }
    
    /*factor input into its prime compisition*/
    public static void factor(int input) {
        while(input %2 == 0) {//since 2 is factored out at this step, consider removing the check for it in isPrime()
            input /= 2;
            System.out.println("2");
        }
        
        for(int i = 3; i <= Math.floor(Math.sqrt(input)); i += 2) {
            while(input % i == 0) {
                input /= i;
                System.out.println(i);
            }
            if(isPrime(input)) {
                System.out.println(input);
                break;
            }
        }
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
