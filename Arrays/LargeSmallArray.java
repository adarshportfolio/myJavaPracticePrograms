//To find the largest and smallest number in an array

public class LargeSmallArray {

    public static int func(int array[]){

        int largest = Integer.MIN_VALUE; //minus infinity
        int smallest = Integer.MAX_VALUE; //plus infinity

        for(int i=0 ; i<array.length; i++){

            if(largest< array[i]){
                largest = array[i];
            }
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println("The smallest value is : " + smallest);
            return(largest);
            
    }
    public static void main(String[] args) {
        
        int array1[] = {2,4,5,9,4,2,1,7};
        int largest = func(array1);
        System.out.println("The largest number is : "+ largest);
    }
    
}
