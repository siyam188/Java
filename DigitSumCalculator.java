package sum.of.digit;
import java.util.Scanner;
public class SumOfDigit {
  public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.print("Enter any number:");
     int num = input.nextInt();
     int sum=0,r,temp;
     temp=num;
     while(temp != 0)
     {
        r= temp % 10;
         sum=sum+r;
         temp=temp / 10;
     }
     System.out.println("Sum of digits:"+sum);
              
    }
    
}
