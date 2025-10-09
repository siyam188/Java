package javaapplication9;
import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] number=new int [2][3];
        for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
               number[row][col]=input.nextInt();
            }
        }
         for(int row=0;row<2;row++)
        {
            for(int col=0;col<3;col++)
            {
               System.out.println(number[row][col]);
            }
        }
        
    }
    
}
