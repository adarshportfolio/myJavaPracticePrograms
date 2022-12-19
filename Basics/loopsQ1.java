/*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers */
import java.util.*;

public class loopsQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int evenSum=0, oddSum=0;
/* 
        System.out.print("Enter the number of Inputs: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print("Enter the value: ");
            int val = sc.nextInt();
            if(val%2==0){
                evenSum+=val;
            }
            else{
                oddSum+=val;
            }
        }
        System.out.println("Even sum is: "+evenSum+", Odd sum is: "+oddSum);
*/        
int choice;
do{
    System.out.print("Enter the value: ");
    int n = sc.nextInt();

    if(n%2==0){ 
        evenSum+=n;
    }
    else{
        oddSum+=n;
    }
    System.out.print("Enter 1 if you want to continue or else press any other key: ");
    choice = sc.nextInt();
}while(choice==1);
System.out.println("Even sum is: "+evenSum+", Odd sum is: "+oddSum);

    }
}
