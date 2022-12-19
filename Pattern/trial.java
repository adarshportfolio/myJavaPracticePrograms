import java.util.*;

public class trial {

    public static void pattern(int x){
        
       for(int i=1; i<=x; i++){
       
        for(int j=1;  j<=i; j++){     
                System.out.print("* ");
        }
        for(int k=1; k<=((2*x)-(2*i)); k++){
            System.out.print("  ");
        }
        for(int s=1;s<=i;s++){
            System.out.print("* ");
        }
        System.out.println();
       }

       for(int i=x; i>=1; i--){
       
        for(int j=1;  j<=i; j++){     
                System.out.print("* ");
        }
        for(int k=1; k<=((2*x)-(2*i)); k++){
            System.out.print("  ");
        }
        for(int s=1;s<=i;s++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {    
        pattern(14);
    }   
}
