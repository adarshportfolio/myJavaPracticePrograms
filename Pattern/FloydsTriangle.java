// 1
// 2 3
// 4 5 6 
// 7 8 9 10

public class FloydsTriangle {
    public static void tri(int tot_rows){
        int count = 1; //for printing the numbers
        for(int i =1; i<=tot_rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    tri(5);
}
}
