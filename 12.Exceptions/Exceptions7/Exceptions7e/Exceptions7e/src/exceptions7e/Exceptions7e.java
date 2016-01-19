package exceptions7e;
import java.io.IOException;

public class Exceptions7e {

    void m() throws IOException {               //Exception yedu wita  ??????????
        throw new IOException();
    }

    public static void main(String[] args) {

        Exceptions7e a = new Exceptions7e();
        try {
            a.m();
        } catch (IOException e) {
             System.out.println("in try catch");
        }
        System.out.println("out try catch");
    }
}
