import java.util.*;

public class sumOfNatNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the natural number: ");
        int n = sc.nextInt();
        int sum = 0, count=1;
        while(count<=n){
            sum += count;
            count++;
        }
        System.out.println("The sum is "+ sum);
    }    
}
