package autoboxing2;
 
public class AutoBoxing2 {

    public static void main(String[] args) {
     Integer a = 1000;
     Integer b = 1000;
     Integer c = 1000;
     
        System.out.println(a == b);
       
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));        
        System.out.println("  ");
         
        Integer d = new Integer(10);
        Integer h = new Integer(10);
        
        System.out.println(d.hashCode());
        System.out.println(h.hashCode());
        System.out.println(d == h);
        
        
        Integer i =  10;
        Integer j =  10;
        System.out.println(i == j);
        System.out.println("  ");

        
        Integer e = new Integer(1000);
        Integer f = new Integer(1000);
        Integer g = new Integer(1000);
        
       System.out.println(e==f);
       System.out.println(e.equals(f));
       System.out.println(e.equals(g)); 
    }
    
}
