package exceptions6b;
public class Exceptions6b {
    void m() {
         throw new ClassCastException();
    }
    public static void main(String[] args) {
        Exceptions6b a = new Exceptions6b  ();
        try{
        a.m();
        }
        catch(ClassCastException e){
             System.out.println("line a");
        }
        System.out.println("line aaaa");
    }
    
}
