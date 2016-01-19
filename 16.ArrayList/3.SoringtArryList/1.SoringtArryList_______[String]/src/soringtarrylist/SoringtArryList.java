package soringtarrylist;
import java.util.ArrayList;
import java.util.Collections;

 public class SoringtArryList {

    
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();      
        a.add("XYZ");
        a.add("AQR");
        a.add("ABC");
        System.out.println("befor--->" + a);
        Collections.sort(a);
        System.out.println("after--->" + a);
    }
    
}
