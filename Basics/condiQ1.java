/*Question 1 : Write a Java program to get a number from the user and print whether it is
positive or negative*/
import java.util.*;

public class condiQ1 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enetr the number: ");
    int n = sc.nextInt();
    String status = (n>=0)? "Positive" : "Negative";
    System.out.println(status);
    }
}
