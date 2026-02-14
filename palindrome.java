
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       // int num=131;
        int temp=num;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println("number is palindrome");
        }
        else{
             System.out.println("number is not a palindrome");
        }
    }
}
