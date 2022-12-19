// 12345
// 1234
// 123
// 12
// 1
//Stars =  rows ;  Spaces = tot_rows-i(that perticular row)
public class InvertedHalfPyramid {
    
    public static void printpyr(int tot_rows, int tot_Col){
        
        for(int i=1; i<=tot_rows; i++){
            //Print the numbers
            for(int j=1; j<=tot_Col-i+1; j++){
                System.out.print(j+" "); //j for numbers
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printpyr(5,5);
    }
}
