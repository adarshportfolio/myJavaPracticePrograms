//Write a program to print the multiplication table of a number N, entered by the
// user.

import java.util.*;

public class loopsQ4 {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number whose table is to be printed: ");
    
    int val = sc.nextInt();
    int prod;

    for(int i=1; i<=10; i++){
        prod= val*i;
        System.out.println(val + " * " + i +" = " + prod);
     }
    }    
}
