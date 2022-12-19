public class LinearSearch1 {
    
    public static int LinearSer(String number[], String key){
        
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        //declare an array
        String number[] = {"idli", "Dosa", "vadapav"};
        String key = "vadapav";

        int index = LinearSer(number, key);
        if(index == -1){
            System.out.println("Could not find the key in the array");
        }
        else{
            System.out.println("The key is in index position number " + index );
        }
    }
}
