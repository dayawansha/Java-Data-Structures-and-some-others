package exceptions6;

public class Exceptions6 {
    void m() {
        try{
            throw new ClassCastException();
        }      
        catch(RuntimeException e){           
        System.out.println("linne a");
        }
   }
    
    public static void main(String[] args) {
        Exceptions6 a = new Exceptions6 ();
        a.m();
        System.out.println("line aaa");
    }   
}
