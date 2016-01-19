 package exceptions10c;
 
import java.io.IOException;

public class Exceptions10c {
       
          
   public static void main(String[] args) throws IOException {
             
       // System.out.println("line x ");
        try {
          throw new IOException();
        } 
        finally
        {
            System.out.println("in the finally ");
        }        
        System.out.println("line p ");
        System.out.println("line q ");
    }
    
}