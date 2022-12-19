import java.util.*;

public class binomialCoeff {
    
    //Binominal coeff is n!/r!*(n-r)!

    public static int fact(int i){  //To find factorial
        int f = 1;
        for(int j =1; j<=i; j++){
            f = f * j;
        }
        return f;
    }


    public static float binoCoef(int n , int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nr_fact = fact(n-r); 
        return(n_fact/(r_fact*nr_fact));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n and r: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("The binomial coeff is "+ binoCoef(n,r));
    }
}
