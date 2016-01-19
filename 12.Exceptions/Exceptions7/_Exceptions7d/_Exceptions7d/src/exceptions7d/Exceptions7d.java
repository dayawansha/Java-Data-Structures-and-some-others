package exceptions7d;
import java.io.IOException;

public class Exceptions7d {

    void m() {
        try {
            throw new IOException();
        } catch (Exception e) {
         System.out.println("catch block ");}
    }
    public static void main(String[] args) {

        Exceptions7d a = new Exceptions7d();

        a.m();
        System.out.println("out try catch");
    }
}
