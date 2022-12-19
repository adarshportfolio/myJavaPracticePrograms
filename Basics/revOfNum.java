import java.util.Scanner;

public class revOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // while(n>0){
        //     System.out.print(n%10);
        //     n=n/10;
        // }
        int rev = 0;
        while(n>0){
        int rem = n%10;
        rev = (rev *10)+rem;
        n=n/10;
    }
    System.out.println("The reverse of thenumber is: " + rev);
  }

}
