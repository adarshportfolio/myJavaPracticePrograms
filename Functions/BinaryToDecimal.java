import java.util.*;

public class BinaryToDecimal {
   
    public static void main(String[] args) {
        int bin_no=101;
        int given = bin_no;
        int last_dig = 0;
        int deci_no = 0;
        int pow =0;


        while(bin_no>0){
            last_dig = bin_no % 10;
            deci_no = deci_no + last_dig * (int) Math.pow(2,pow); //type casting is an imp point here
            pow++;
            bin_no = bin_no / 10;
        }
        System.out.println("The decimal number of the given "+ given + " binary number is "+ deci_no);
    }
}
