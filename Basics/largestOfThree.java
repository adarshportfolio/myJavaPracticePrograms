import java.util.*;

public class largestOfThree {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);

        int a=1, b=3, c=6;

        if(a>b && a>c){
            System.out.println("A is the largest number");
        }
        else if(b>c){   //Since we already checked on B
            System.out.println("B is the largest number");
        }
        else{
            System.out.println("C is the largest number");
        }

    }
}
