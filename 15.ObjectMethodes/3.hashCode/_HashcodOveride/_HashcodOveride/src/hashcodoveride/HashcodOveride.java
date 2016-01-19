package hashcodoveride;

class Person {
    String name;
    
    Person(String s) {
        name = s;
    }
    @Override
    public int hashCode() {
        return name.length();
    }
}
    public class HashcodOveride {   
    public static void main(String[] args) {
        Person a = new Person("saman");
        Person b = new Person("don");
        
        System.out.println(a);
        System.out.println(b);
    }
}
