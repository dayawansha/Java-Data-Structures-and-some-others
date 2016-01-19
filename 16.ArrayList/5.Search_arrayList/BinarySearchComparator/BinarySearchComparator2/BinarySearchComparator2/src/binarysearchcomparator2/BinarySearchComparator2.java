 package binarysearchcomparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String s) {
        name = s;
        
    }   
    @Override
    public String toString(){
    return name ;
    }
}
class A implements Comparator<Person> {

        @Override
        public int compare(Person a, Person b) {
            return a.name.compareTo(b.name);
        }
    }
 class B implements Comparator<Person> {

        @Override
        public int compare(Person a, Person b) {
            return b.name.compareTo(a.name);
        }
    } 
public class BinarySearchComparator2 {
   
    public static void main(String[] args) {
        
        ArrayList<Person> a = new ArrayList<Person>();
        a.add(new Person("Zeena"));
        a.add(new Person("Nalin"));
        a.add(new Person("Amal"));
        a.add(new  Person("Dushaman"));
        
       System.out.println(a);
        
        Collections.sort(a, new A()) ;
        System.out.println(a);
        System.out.println(Collections.binarySearch(a, new Person("Amal"), new A() ) );
                   
        Collections.sort(a,new B()) ;
        System.out.println(a);
        
        System.out.println(Collections.binarySearch(a, new Person("Zeena"), new B() ) );
        
    }
    
}
