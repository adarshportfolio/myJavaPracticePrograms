import java.util.*;

public class BinarySearch {
    
    public static int search(int array[],int  keys){

        int start = 0;
        int end = array.length-1;
        

        while(start <= end){
            int mid = (start + end) /2;
            if(array[mid]==keys){
                return mid;
            }
            else if(array[mid] < keys){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,9,12,45}; //should be in a sorted order
        int key = 45;
        int index = search(arr,key);
        System.out.println("The key is in the index position : "+ index);
    }
}
