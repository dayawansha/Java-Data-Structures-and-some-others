package treeset1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
 
    public static void main(String[] args) {
     Set t = new TreeSet();    
     t.add("a");
     t.add("d");
     t.add("b");
     t.add("c");
     
     for(Object s : t){
         System.out.println(s + "  ");
     }
    }
    
}
