import java.util.*;

public class MinMixSubArray {

    
    public static void subArray(int arr[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<arr.length; i++){
            int start=i;
            //now for second element to last
            for(int j=i; j<arr.length; j++){ //j=i becz we also need the first elem
                int end=j;
                //third loop for printing
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                    sum = sum +arr[k];
                }
                System.out.println();
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
                sum=0;
            }
            System.out.println();
        }
        System.out.println("The max no is: "+ max + " & The min no is "+ min);
    }
    public static void main(String[] args) {
        int arr[] = {5 ,4 ,6, 8, 10};
        subArray(arr);
    }
}
