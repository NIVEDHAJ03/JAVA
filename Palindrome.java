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
/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
*/
