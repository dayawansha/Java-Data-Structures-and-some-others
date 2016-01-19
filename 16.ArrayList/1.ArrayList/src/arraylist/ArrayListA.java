package arraylist;
import java.util.ArrayList ;
public class ArrayListA {

   
    public static void main(String[] args) {
         ArrayList a = new ArrayList();           ///  List a = new ArrayList
         a.add("ABC");
         a.add(new Integer(10));
         a.add(new ArrayListA());
         System.out.println("length = " + a.size());
         System.out.println(a.get(0));
         System.out.println(a.get(1));
         System.out.println(a.get(2));
         System.out.println(a);
    }
}
