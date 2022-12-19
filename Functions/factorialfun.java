public class factorialfun {
   
   
    public static int fact(int i){
        int f = 1;
        for(int j =1; j<=i; j++){
            f = f * j;
        }
        return f;
    }
   
    public static void main(String[] args) {
        System.out.println(fact(9));   
       

    }
    
}
