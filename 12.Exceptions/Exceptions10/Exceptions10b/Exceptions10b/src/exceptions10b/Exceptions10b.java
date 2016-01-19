 package exceptions10b;

import java.io.IOException;

public class Exceptions10b {

    
   public static void main(String[] args) {
             
     //   System.out.println("line x ");
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