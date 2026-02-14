import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0){
            System.out.println("given number is leapyear");
        }
        else if(n%4==0){
            System.out.println("given number is  a leapyear");
        }
        else{
           System.out.println("given number is not a leapyear"); 
        }
    }
    
}
