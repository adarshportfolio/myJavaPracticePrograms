import java.util.Scanner;   //Keep entering the numbers till the user enters a multiple of 10;

public class multiOfTen {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 /*   do{
        System.out.print("Enter the number to be checked: ");
        int n = sc.nextInt();
        if(n%10==0){
            break;
        }
        System.out.println(n);

    }while(true);             */    

    // OR

    while(true){
        System.out.print("Enter the number to be checked: ");
        int n = sc.nextInt();

        if(n%10 == 0){
            break;
        }
        System.out.println(n + " is not a multiple of 10! kindly retry.");
    }
}    
}
