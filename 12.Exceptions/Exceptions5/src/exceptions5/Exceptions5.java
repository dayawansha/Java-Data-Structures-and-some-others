package exceptions5;

public class Exceptions5 {

   void m() throws RuntimeException{
       
   throw new ClassCastException();
   
   }

   static void l(){
   
   int x;}
    public static void main(String[] args) {
        
       Exceptions5 a = new Exceptions5();
       a.m();
       System.out.print("line x");
    }   
}
