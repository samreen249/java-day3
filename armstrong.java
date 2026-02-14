import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum=sum+digit*digit*digit;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("number is armstrong");
        }
        else{
             System.out.println("number is  not a armstrong");
        }
    }
    
}
