package exceptions9c;
import java.io.IOException;

public class Exceptions9c {

    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (Throwable e) {
            System.out.println(e);
            System.out.println("Throwable");
        }  catch (IOException e) {
            System.out.println(e);
            System.out.println("IOException");
        }catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception");
        }
    }
}
