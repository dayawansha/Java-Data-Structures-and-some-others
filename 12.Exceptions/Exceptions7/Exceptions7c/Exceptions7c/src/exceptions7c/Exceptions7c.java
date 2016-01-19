
package exceptions7c;
import java.io.IOException;


public class Exceptions7c {

   void m() throws IOException  {
        throw new IOException();
    }

    public static void main(String[] args) throws IOException  {

        Exceptions7c a = new Exceptions7c();

        a.m();
        System.out.println("out try catch");
    }}