import java.util.*;

public class DecimalToBinary {
    
    public static void dtb(int n){
        int bin_no = 0;
        int powr = 0;
        while(n>0){
           int rem = n % 2; //div by 2 not 10
            bin_no = bin_no + ((int)Math.pow(10,powr) * rem);  //To print 1001... in reverse order of reminder
            powr++;
            n = n / 2;
        }
        System.out.println("The binary number is : " + bin_no);
    }
    
    public static void main(String[] args) {
        dtb(8);
    }
}
