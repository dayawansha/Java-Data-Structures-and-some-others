package soringtarrylistobj;
import java.util.ArrayList;
import java.util.Collections;

class Person{
 int age ;
 String name ;
 
 Person (int x,String y){
  age = x;
  name = y;
  }
public String toString(){
  return name ;
  }
}
public class SoringtArryListObj {
    public static void main(String[] args) {
        Person a = new Person(22,"Amal");
        Person b = new Person(21,"Namal");
        Person c = new Person(20,"Dushman");
        
        ArrayList<Person> p = new ArrayList<Person>();
        p.add(a);
        p.add(b);
        p.add(c);
        System.out.println("befor--->" + p);
          Collections.sort(p);
        System.out.println("after--->" + p); 
        

    }

}
