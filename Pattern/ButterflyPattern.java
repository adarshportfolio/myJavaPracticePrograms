public class ButterflyPattern {
    public static void butter(int n){
        //Upper part
        for(int i=1; i<=n; i++){
            //star printing
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space printing
            for(int sp=1; sp<=2*(n-i); sp++){
                System.out.print(" ");
            }
            //star printing again
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Inverted part
        for(int i=n; i>=1; i--){  //for inverted convert only the outer loop logic from n to 1 instead of 1 to n before.
             //star printing
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space printing
            for(int sp=1; sp<=2*(n-i); sp++){
                System.out.print(" ");
            }
            //star printing again
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   
        public static void main(String[] args) {
            butter(4);
        }
    
}
