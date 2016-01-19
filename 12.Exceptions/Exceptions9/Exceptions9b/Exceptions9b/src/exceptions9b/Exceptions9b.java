package exceptions9b;
import java.io.IOException;

public class Exceptions9b {

    public static void main(String[] args) {

        try {
            throw new IOException();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception");
        } catch (Throwable e) {
            System.out.println(e);
            System.out.println("Throwable");
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("IOException");
        }
    }
}
