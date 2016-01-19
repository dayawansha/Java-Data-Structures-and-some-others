package map1;
import java.util.HashMap;
import java.util.Map;

class Dog {
    public String name;
    public Dog(String s) {
        name = s;
    }
    
    @Override
    public boolean equals(Object t) {
        if (  (t instanceof Dog) && ( ((Dog) t).name ).equals(name)  ) {
            return true;
        }       
        else{               
        return false;
        }}
    
    @Override
    public int hashCode() {
        return name.length();
    }
    
    @Override
    public String toString() {
        return "hot dog";
}}

class Cat {}

enum pets {  DOG, CAT, HORSE  }

public class Map1 {
    public static void main(String[] args) {
        Map<Object, Object> m = new HashMap<Object, Object>();

        Dog a = new Dog("aiko");
        
        m.put("k1", a);
        m.put("k5", a);
        m.put("k2", pets.DOG);
        m.put(pets.CAT, "CAT key");
        m.put(new Dog("clover"), "Dog key");
        m.put(new Cat(), "CAT key");                   // line x

        System.out.println(m.get("k1"));
        System.out.println(m.get("k3"));
        System.out.println(m.get("k2"));
        System.out.println(m.get(pets.CAT));
        System.out.println(m.get(new Dog("clover")));
        System.out.println(m.get(new Cat()));           // line x
        System.out.println(m.size());
        
        // for undestand line x,,, 
        System.out.println("");
        System.out.println(new Cat()); 
        System.out.println(new Cat()); 
        
        

    }

}
