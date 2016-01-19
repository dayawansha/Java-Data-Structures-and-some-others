package exceptions10;

import java.io.IOException;

public class Exceptions10 {
    
    public static void main(String[] args)  {
         
        try {
          throw new IOException();
        
        } catch (Exception e) {
            System.out.println("in the catch block");
        }
        
        finally
        {
            System.out.println("in the finally ");
        }        
        System.out.println("line x ");
    }
    
}
