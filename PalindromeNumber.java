package palindrome.number;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
      System.out.print("Enter any number:");
     int num = input.nextInt();
     int sum=0,r,temp;
     temp=num;
     while(temp != 0)
     {
        r= temp % 10;
         sum=sum *10 +r;
         temp=temp / 10;
     }
     if(num==sum)
     {
         System.out.println(num+" is Palindrome Number ");
     }
     else
     {
        System.out.println(num+" is not Palindrome Number ");

     }
        
    }
    
}
