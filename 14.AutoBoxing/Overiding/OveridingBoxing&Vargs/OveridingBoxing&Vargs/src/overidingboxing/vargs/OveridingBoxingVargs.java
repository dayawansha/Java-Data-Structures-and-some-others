package overidingboxing.vargs;

public class OveridingBoxingVargs {

    void m (Byte x , Byte y){
        System.out.println("boxing wins");
    }
    
    void m(byte...x){
        System.out.println("Var args wins");
    }  
    
    public static void main(String[] args) {
        
        OveridingBoxingVargs t = new OveridingBoxingVargs();
        byte a = 10 ;
         byte b = 20 ;
         t.m(a,b);
    }
}
