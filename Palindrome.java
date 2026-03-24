public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        int rev=0, t=n;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(t == rev){
            System.out.println("gn is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
