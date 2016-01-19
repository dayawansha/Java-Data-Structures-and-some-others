package searsh1;
 
import java.util.ArrayList;
import java.util.Collections;

public class Searsh1 {
 
    public static void main(String[] args) {
        ArrayList<String> a  = new ArrayList<String>();
        
        a.add("bcd");
        a.add("pqr");
        a.add("xyz");
        a.add("efg");
        
                                                                    //   unsorted   {bcd, pqr , xyz  , efg  }
        System.out.println(Collections.binarySearch(a, "efg" ));     //     -2
        System.out.println(Collections.binarySearch(a, "xyz" ));     //     2
        System.out.println(Collections.binarySearch(a, "abc" ));     //     -1 
        System.out.println(Collections.binarySearch(a, "hij" ));     //     -2
       
        
        
        Collections.sort(a);                                       // sorted    { bcd, efg ,  pqr , xyz  }
        System.out.println(Collections.binarySearch(a, "abc"));    //  -1
        System.out.println(Collections.binarySearch(a, "pqr"));    //  2
        
        System.out.println(Collections.binarySearch(a, "efg"));    //  1
        System.out.println(Collections.binarySearch(a, "hij" ));   //  -3 
        
        
    }
    
}
