package exceptions9;
import java.io.IOException;

public class Exceptions9 {
  
      public static void main(String[] args) {
     
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("IOException");
        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception");
        }catch (Throwable e) {
            System.out.println(e);
            System.out.println("Throwable");
        }      
    }
}

