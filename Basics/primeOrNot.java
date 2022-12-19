import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(n==2){     //Special case to be considered
            isPrime=false;
        }
        if(isPrime==true)
        System.out.println("It is prime");
        else
        System.out.println("It is not prime");
    }
}
