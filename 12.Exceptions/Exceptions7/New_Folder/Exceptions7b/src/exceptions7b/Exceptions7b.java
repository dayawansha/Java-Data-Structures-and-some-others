package exceptions7b;
import java.io.IOException;

public class Exceptions7b {

    void m() throws Exception {
        throw new IOException();
    }

    public static void main(String[] args)  {

        Exceptions7b a = new Exceptions7b();

        a.m();
        System.out.println("out try catch");

    }
}
