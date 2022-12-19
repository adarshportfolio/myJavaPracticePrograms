// *****
// *   *
// *   *
// *   *
// *****
public class HollowRectangle {

    public static void printRect(int totRow, int totCol){
        //Outer loop
        for(int i=1; i<=totRow; i++){
            //Inner loop
            for(int j=1; j<=totCol; j++){
                //Now the condition to print stars(look at note book)

                if(i==1 || i==totRow || j==1 || j==totCol){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
              
            }  System.out.println();
        }
    }
public static void main(String[] args) {
    printRect(4, 10);   
 }
}