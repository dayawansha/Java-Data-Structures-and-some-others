package instanceof1;

class Animal { }
class Cat {}

 public class Dog1 extends Animal {                 //Dog inherits Animal  
    public static void main(String args[]) {
        
        Dog1 d = new Dog1();
        
        System.out.println(d instanceof Dog1);      //true  
        System.out.println(d instanceof Animal);    //true
        System.out.println( new Dog1() instanceof Animal);
       
      // System.out.println(Animal instanceof d);  // C.E. 
      //  System.out.println(d instanceof Cat);    // C.E. 
      
      Dog1 e = null;
      System.out.println(e instanceof Animal);//true  
    }
}
