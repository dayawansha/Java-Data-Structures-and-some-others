package overidingwide.vargs;
 
public class OveridingWideVargs {

    void m (int x, int y){
        System.out.println("Widing wins");
    }
    
    void m(byte...x){
        System.out.println("Var args wins");
    }
   public static void main(String[] args) {
         OveridingWideVargs  t = new OveridingWideVargs ();
         byte a = 10 ;
         byte b = 20 ;
         t.m(a,b);
    }
    
}
