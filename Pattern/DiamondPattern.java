public class DiamondPattern {
    public static void pattern(int n){
        int count =1;
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){       
                System.out.print("  ");
            }
            //Star
            for(int k=1; k<=count; k++){ //or use for(int k=1; k<=(2*i)-1; j++) using this we dont need count variable and we canmirror it directly
                System.out.print("* ");
            }
            count=count+2;
            System.out.println();
        }   
   
    //Now for the inverted part
    int count2 =(2*n)-1;            //Focus on the count2 part or you dont need a count part at all, use (2*i)-1
    for(int i=n; i>=1; i--){
        //Spaces
        for(int j=1; j<=n-i; j++){
            System.out.print("  ");
        }
        //Star
        for(int k=1; k<=count2; k++){
            System.out.print("* ");
        }
        count2=count2-2;
        System.out.println();
    }   
}
    public static void main(String[] args) {
        pattern(41);
    }
    
}
