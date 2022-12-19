//Here also we have to find the max sum of any sun array from a given array but by using kadanes algo which is most optimised by using only a single loop
package Arrays;
public class KadanesAlgo {

    public static void kadanes(int arr[]){
        int cs = 0; //CS - Current Sum
        int ms =Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }   
            ms = Math.max(ms, cs);
        }
        //Special case
        if(ms == 0){ //which means all elem are -ve - so find the most neg no
            int neg = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++){
                int val = arr[i];
                neg = Math.min(val, neg);
                // if(val < neg){
                //     neg = val;
                // }
            } ms = neg;
        }
        System.out.println("The max sum of a sub array is : "+ ms);
    
    }
    

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);

        //Special case
        int negArr[]={-1,-20,-3,-4};
        kadanes(negArr);

    }
}
