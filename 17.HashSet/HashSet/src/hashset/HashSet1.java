package hashset;

import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args) {
        boolean[] array1 = new boolean[5];
        HashSet set1 = new HashSet();   // HashSet x = new HashSet();

        array1[0] = set1.add("pp");
        array1[1] = set1.add(new Integer(45));
  //      array1[3] = set1.add("pp");
        array1[4] = set1.add(new Object());
  //      array1[5] = set1.add("ff");

        for (boolean a : array1) {
            System.out.println(a + " ");
        }
        System.out.println("");

        for (Object t : set1) {
            System.out.println(t + " ");
        }
    }
}
