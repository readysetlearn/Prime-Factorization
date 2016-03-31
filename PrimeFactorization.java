package primefactorization;


public class PrimeFactorization {


    public static void main(String[] args) {
        int[] test = {900937, 541580968};
        for(int i : test) {
            System.out.print(i+" is ");
            if(isPrime(i)) {
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
    }
    
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
