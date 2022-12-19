import java.util.*;

public class functionsBasic {
    
    public static void printHelloWorld(){
        System.out.println("Hello World");
        return;
    }
    
    public static int printSum(int a, int b){   //formal parameters inside the func defenition
        int sum = a+b;
        return(sum);
    }

    //no return type with parameters : use void
 /*    public static void printSum(int a, int b){
             System.out.println("The sum is "+  (a+b ) );
    }
*/

    public static int multiply(int a, int b){
        return (a*b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printHelloWorld();
        printHelloWorld();
        printHelloWorld();

        int a = sc.nextInt();
        int b = sc.nextInt();   

        int add = printSum(a,b);    //actual parameters
        System.out.println("The sum is "+ add);

        int prod = multiply(5,6);
        System.out.println("The product is "+ prod);
    }
}
