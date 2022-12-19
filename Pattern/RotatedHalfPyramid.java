//     *
//    **
//   ***
//  ****
//Stars =  rows ;  Spaces = tot_rows-i(that perticular row)
public class RotatedHalfPyramid {

    public static void rotPyramid(int tot_rows, int tot_Col){

        int Spaces = 0;
        //outer loop
        for(int i=1; i<=tot_rows; i++){

            //first print spaces
            for(int j=1 ; j<=tot_rows-i; j++){
                System.out.print("  ");
            }
            //for printing the stars
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }


    public static void main(String[] args) {
        rotPyramid(4, 5);
    }
    
}
