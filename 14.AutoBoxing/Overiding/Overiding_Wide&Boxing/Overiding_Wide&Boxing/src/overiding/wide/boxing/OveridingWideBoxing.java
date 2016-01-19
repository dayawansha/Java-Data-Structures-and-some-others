package overiding.wide.boxing;
public class OveridingWideBoxing {

    void m (int x, int y){
        System.out.println("Widing wins");
    }
    
    void m (Integer x , Integer y){           //   ( Byte x , Byte y )
        System.out.println("boxing wins");
    }
     public static void main(String[] args) {
         
         OveridingWideBoxing t = new OveridingWideBoxing();
         byte a = 10;
         byte b = 20;
         t.m(a, b);    //  t.m(10 , 10) ; 
    }
    
}
