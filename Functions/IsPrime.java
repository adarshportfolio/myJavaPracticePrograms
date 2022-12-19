import java.util.*;
public class IsPrime {

 /*    public static boolean prime(int n){

        //corner cases
        if(n==2){
            return true; //get out of this function
        }

        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                return false; //get out of the loop indicating non prime
            }
        }

        return true;//since out of forloop it is prime
    }
*/

 //OPTIMISED APPRACH IS  2--> ROOT(N)

 public static boolean prime(int n){

    //corner cases
    if(n==2){
        return true; //get out of this function
    }

    for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i == 0){
            return false; //get out of the loop indicating non prime
        }
    }

    return true;//since out of forloop it is prime
}

    public static void main(String[] args) {
        boolean x = prime(8);
        
        if(x==true){
            System.out.println("It is prime");
        }else{
            System.out.println("Not prime");
        }
    }
    
}
