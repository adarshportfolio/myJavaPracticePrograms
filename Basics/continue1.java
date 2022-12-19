import java.util.Scanner;
public class continue1 {     //Display all numbers entered by the user except multiples of 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the number:");
            int n = sc.nextInt();

            if(n%10 == 0)
            {
                continue;
            }
            System.out.println(n + " is not a multiple of 10");
        }while(true);

    }
}
