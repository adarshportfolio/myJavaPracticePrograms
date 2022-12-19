public class palindrome {

    public static boolean palin(int n){
        int rev = 0, rem=0;
        int orgi = n; // Always make a copy of the original
        while(n>0){
        rem = n%10;
        rev = (rev * 10) + rem;
        n=n/10;
    }
    if(orgi==rev){
        return true;
    }
    return false;
}

    public static void main(String[] args) {
        if(palin((int)123)){
            System.out.println("The given number is a Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
