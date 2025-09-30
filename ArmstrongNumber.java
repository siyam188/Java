package armstrong.number;
import java.util.Scanner;
public class ArmstrongNumber {
   public static void main(String[] args) {
             Scanner input = new Scanner (System.in);
      System.out.print("Enter any number:");
     int num = input.nextInt();
     int sum=0,r,temp;
     temp=num;
     while(temp != 0)
     {
        r= temp % 10;
         sum=sum+r*r*r;
         temp=temp / 10;
     }
     if(sum==num)
     {
     System.out.println(num+ " is Armstrong number");
     }
     else
     {
            System.out.println(num+ " is  not Armstrong number");
  
     }
              
    }
    
}
