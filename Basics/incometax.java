import java.util.*;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the income in lakhs: ");
        int income =  sc.nextInt();
        float tax;
        int tax1;

        if(income < 5){
            System.out.println("Tax =0%");
        }
        else if(income >=5 && income <10){
            tax=(income*0.2f);
            System.out.println("Tax = "+ tax + "%");
        }
        else if(income>=10){
            tax1=(int)(income*0.3);
            System.out.println("Tax = "+ tax1 + "%");
        }
    }
    
}
