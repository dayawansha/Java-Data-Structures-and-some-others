package soringtarrylistb;

import java.util.ArrayList;
import java.util.Collections;

public class SoringtArryListB {

     public static void main(String[] args) {
         ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(new Integer (23));
        a.add(new Integer (86));
        a.add(new Integer (1));
        System.out.println("befor--->" + a);
        Collections.sort(a);
        System.out.println("after--->" + a); 
    }
    
}
