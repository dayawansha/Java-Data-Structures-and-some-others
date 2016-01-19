package binarysearchcomparable;
import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {

    String name;
    Person(String a) {
        name = a;
    }  
    @Override
    public int compareTo(Person x) {
        return -(this.name.compareTo(x.name));
    }    
    @Override
    public String toString(){
    return name;}
}
public class Binarysearchcomparable {
    public static void main(String[] args) {
        

        ArrayList<Person> p = new ArrayList<Person>();
        p.add(new Person("Dushman"));
        p.add(new Person("Namal"));
        p.add(new Person("Amal"));
        
        System.out.println("befor--->" + p);
        Collections.sort(p);
        System.out.println("after--->" + p);
        System.out.println(Collections.binarySearch(p ,new Person("Dushman") ));
    }
}
