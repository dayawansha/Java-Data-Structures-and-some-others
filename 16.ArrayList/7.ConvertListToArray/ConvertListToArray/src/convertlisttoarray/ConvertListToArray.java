package convertlisttoarray;
import java.util.ArrayList;
 public class ConvertListToArray {
 
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
         
        System.out.println(list1);
        
       // Object[]  array1 = list1.toArray();                                // create an object array
        Integer[]  array2= list1.toArray( new Integer[  list1.size()] );    // create a new integer array
        
        Integer[] array3 = new Integer[list1.size()];
        list1.toArray(array3);
        
        for (int i : array3){ System.out.println(i); }
         System.out.println();   
    }   
}
