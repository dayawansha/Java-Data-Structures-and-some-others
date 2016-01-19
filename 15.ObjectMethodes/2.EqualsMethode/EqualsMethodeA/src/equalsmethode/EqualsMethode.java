package equalsmethode;
class  Person{
    int age;
    
    Person(int a){
    age = a;
    }     
   /* public String toString(){
    return new Integer(age).toString();
   }*/
}
public class EqualsMethode {       
    public static void main(String[] args) {
        
        int x = 5;
        System.out.println(x%2);
        
        Person a = new Person(23);
        Person b = new Person(23);
        Person c = a;
             
        System.out.println(a.equals(b));
        System.out.println(a.equals(c)); 
        
        /*  int p = 10;
          int q = 10;        
         System.out.println(p.equals(q));   */
    }   
}
