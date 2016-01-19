package exceptions7;
import java.io.IOException;

public class Exceptions7 {
     
    void m() {
        throw new IOException();
    }

    public static void main(String[] args) {

        Exceptions7 a = new Exceptions7();
        a.m();
        System.out.println("line x");
    }
}
