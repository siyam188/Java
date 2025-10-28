class Return{
  int square(int value)
  {
      return value*value;
  }
    
}

public class Main {  
    public static void main(String[] args) {
         Return r1 = new  Return();
      int result = r1.square(5);
      System.out.print(result);
    }
}
