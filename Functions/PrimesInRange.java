import java.util.*;

public class PrimesInRange {
    //In the given range check & print if prime
    public static void primesInRange(int n){

        for(int i=2; i<=n; i++) {
            // boolean check = isPrime(i);
            // if(check == true){
            //     System.out.print(i+" ");
            // }

            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    //Check prime function
     public static boolean isPrime(int c){
        if(c == 2){
           return true;
        }
        for(int i=2; i<=Math.sqrt(c);i++){
            if(c%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the range in which prime numbers are to be printed: ");
        Scanner sc = new Scanner(System.in);
        int r =  sc.nextInt();
        primesInRange(r);
    }
}
