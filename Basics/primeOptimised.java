import java.util.*;

public class primeOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        char again = 'y';
        do{
         System.out.print("Enter the number :");
        int n = sc.nextInt();
        if(n==2){     //Special case to be considered
            System.out.println("2 is prime");
        }
        else{
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){     //Main point
            if(n%i==0){
                isPrime=false;
            }
        }
        
    
        if(isPrime==true)
        System.out.println("It is prime");
        else
        System.out.println("It is not prime");

        System.out.println("Do you want to try again 'y' or 'n' ");
        again = sc.next().charAt(0);
        }
    
    }while(again == 'y'); 
    System.out.println("Until next time Bye...");
 }
}