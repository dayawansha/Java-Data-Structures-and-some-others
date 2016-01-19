package equalsmethoded;
class Person {
    int age;

    Person(int a) {
        age = a;
    }
    public boolean equals(Person b) {       // mehi reference aka Object b lesada diya hakiya
        if (this.age == ((Person) b).age){     //   (this.age == b.age) lesada gatha hakiya
            return true;
    }
       else 
        return false;
  }}
public class EqualsMethodeD {

    public static void main(String[] args) {
         Person a = new Person (23);
         Person b = new Person(23);       
         System.out.println(a.equals(b));         
    }
}
