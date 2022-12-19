//     *****
//    *****
//   *****
//  *****
// *****

public class SolidRhombus {

    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i;j ++){
                System.out.print("  ");
            }
            //star
            for(int k=1; k<=5; k++){//always print 5 star
                System.out.print("* ");
            }
        System.out.println();
    }
}
    
    public static void main(String[] args) {
        pattern(5); //rhombus of 5 lines
    }
}
