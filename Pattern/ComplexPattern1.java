// 0-1 Triangle Pattern

// 1
// 01
// 101
// 0101
// 10101

public class ComplexPattern1 {
    public static void tri(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                if((i+j)%2==0){  //even then print 1
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+ " ");
                }
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        tri(5);
    }
}
