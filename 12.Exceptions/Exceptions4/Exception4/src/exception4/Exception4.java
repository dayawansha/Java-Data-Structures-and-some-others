package exception4;
import java.io.IOException;
import java.net.Socket;

public class Exception4 {
    
    public static void main(String[] args) throws IOException {
                  
        Socket A = new Socket();
        System.out.println("line a");
        
       /* throw new ArrayIndexOutOfBoundsException();
         System.out.println("line f");
         System.out.println("line g");*/
        
        throw new IOException();
        System.out.println("line b");
        System.out.println("line c");
    }   
}
