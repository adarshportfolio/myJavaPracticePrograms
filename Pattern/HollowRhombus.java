//     *****
//    *   *
//   *   *
//  *   *
// *****
public class HollowRhombus {

    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            //Spaces only
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars print hollow rectangle(after the space)
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }


public static void main(String[] args) {
    pattern(9);    
}    
}
