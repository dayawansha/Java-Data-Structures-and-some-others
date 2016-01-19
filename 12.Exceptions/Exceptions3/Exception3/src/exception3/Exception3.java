package exception3;
import java.io.IOException;

public class Exception3 {

  public static void main(String[] args) {
      
     // throw new IOException();
     System.out.print("line special");
      
      throw new ArrayIndexOutOfBoundsException();   //  run time exception
      System.out.print("line x");
      System.out.print("line x");
      
      throw new IOException();      // compile time exception
     /// System.out.print("line y");
    }
}
