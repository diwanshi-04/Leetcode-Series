
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n= 235632;
        int temp=n;
        int rev =0;
        while (n>0){
            int r = n%10;
            rev= (rev*10)+r;
            n=n/10;
        }
        if (temp==rev){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
            
        }
    }
}
