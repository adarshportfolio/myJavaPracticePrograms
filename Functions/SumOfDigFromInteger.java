public class SumOfDigFromInteger {   //Write a Java method to compute the sum of the digits in an integer.

    
    public static int sumInt(int n){
        int sum = 0;
        int rem;

        while(n>0){
            rem = n %10;
            sum += rem;
            n = n/10; 

        }
        return sum;
    }

    public static void main(String[] args) {
        int x  = sumInt(1234988);
        System.out.println("The sum of the integer is : "+ x);
    }

}
