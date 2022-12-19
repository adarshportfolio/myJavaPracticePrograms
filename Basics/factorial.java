import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fact=1;
        System.out.print("Enter the number: ");
        int val = sc.nextInt();

        // for(int i =1; i<=val; i++)
        // {
        //     fact*=i;
        // }

        for(int i=val; i>=1; i--){
            fact*= i;
        }
        System.out.print("The factorial is : "+ fact);
    }
}
