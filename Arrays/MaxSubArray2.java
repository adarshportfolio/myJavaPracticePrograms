//Here we use prefix array method, so instead of 3 loops in MinMixSubArray we use 2 loops only here and 
//we use the formula        prefix[end]-prefix[start-1]

public class MaxSubArray2 {

    public static void subArray(int arr[]){

        //create a new array
        int prefix[] = new int[arr.length];
        //store elem in prefix array
        //1st elem is same in both array
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i]=prefix[i-1] + arr[i];
            // System.out.println(prefix[i]+" "); Just checking
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                //first elem start cannot be zero, since start-1 ==> 0-1 no sence
                currsum = start == 0? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum < currsum){
                    maxSum = currsum;
                }
            }
        }
        System.out.println("max sum = "+ maxSum);


    }

    public static void main(String[] args) {
        int arr[] = {1 ,-2 ,6, -1, 3};
        subArray(arr);
    }
}
