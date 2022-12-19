public class LinearSearch {
    
    public static int LinearSer(int number[], int key){
        
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        //declare an array
        int number[] = {2,3,4,5,6,78,45,85};
        int key = 45;

        int index = LinearSer(number, key);
        if(index == -1){
            System.out.println("Could not find the key in the array");
        }
        else{
            System.out.println("The key is in index position number " + index );
        }
    }
}
