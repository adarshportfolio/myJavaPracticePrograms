import java.util.*;
public class nos1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        while(count<=n){
            System.out.print(count +" ");
            count++;
        }
    }
}
