package treeset2;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {
    
    int age;
    TreeSet2(int x){
      age = x;
     }
    public static void main(String[] args) {
       Set a = new TreeSet(); 
    //   a.add("a");                                    //  C . E.
   //    a.add("b");                                    //  C . E.
   
   //   a.add(new Object ());                           //  C . E.
  //     a.add( new TreeSet2(19) );                     //  C . E.
  //     a.add( new TreeSet2(11) );                     //  C . E.
  //     a.add( new TreeSet2(15) );*/                   //  C . E.
       
       a.add(3);
       a.add(1);
       a.add( new Integer(19) );
       a.add( new Integer(11) );
       a.add( new Integer(7) );
              
     for(Object s : a){
         System.out.println(s + "  ");
     }  
    }}
