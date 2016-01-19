package binarysearchcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String s,int x) {
        name = s;
        age = x;
    }
    
    @Override
    public String toString(){
    return name + "  " + age;
    }
}
class A implements Comparator<Person> {

        @Override
        public int compare(Person a, Person b) {
            return a.name.compareTo(b.name);
        }
    }
class B implements Comparator<Person>{
        @Override
        public int compare(Person a, Person b){
            if(a.age == b.age)
                return 0;
            else if (a.age > b.age)
                return 1;
            else
                return -1;                 
        }
}
public class BinarySearchComparator {

    public static void main(String[] args) {
        ArrayList<Person> a = new ArrayList<Person>();
        a.add(new Person("Zeena",24));
        a.add(new Person("Nalin",21));
        a.add(new Person("Amal",23));
        a.add(new  Person("Dushaman", 25));
        
       System.out.println(a);
        
        Collections.sort(a, new A()) ;
        System.out.println(a);
        System.out.println("Amal at "+Collections.binarySearch(a, new Person("Amal",23), new A()));
       
        
        Collections.sort(a,new B()) ;
        System.out.println(a);       
        System.out.println("Zeena at " + Collections.binarySearch(a, new Person("Zeena",24), new B()  )  );
        System.out.println("Amal at "+ Collections.binarySearch(a, new Person("Amal",23) , new  B()   )    );
        
         
    }

}
