package pattern;
import java.util.Scanner;
public class Pattern {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter line number:");
        int num=input.nextInt();
        for(int row=num;row>=1-num;row--)
        {
            for(int col=1;col<=row;col++)
            {
                 System.out.print(" "+col%2);
            }
                  System.out.println();
        }
           
    }
    
}
