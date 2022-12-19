import java.util.*;

public class billGst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int $=25; //no error

        System.out.print("Enter the cost of the pencil: Rs ");
        float p = sc.nextFloat();
        System.out.print("Enter the cost of the pen: Rs ");
        float n = sc.nextFloat();
        System.out.print("Enter the cost of the book: Rs ");
        float b = sc.nextFloat();

        float total = (p+b+n+$)+(p+b+n)*0.18f;
        System.out.println("BILL \nThe total cost is: " + total);
    }
}
