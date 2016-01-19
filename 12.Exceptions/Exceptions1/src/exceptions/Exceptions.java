package exceptions;
import java.io.IOException;

public class Exceptions {
    
    void m(){
    System.out.println("m methode");
    }

    public static void main(String[] args) {
        int[] a = new int[3];
        Exceptions b = new Exceptions();
        
        
        try {
            System.out.println("point special");
          //  a[5] = 2;
            
            System.out.println("point 1");
            System.out.println("point 2");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            
            b.m();
            System.out.println("in the catch clause");
            System.out.println("exception = "+ e);
        }       
        System.out.println("Line A");
        
         throw new IOException(); 
               
    }
}
