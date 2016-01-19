package stringbuffer;

 
public class StringBuffer1 {

    
    public static void main(String[] args) {
    
        StringBuffer a = new StringBuffer("abc") ;
        a.append("123");                             // do not wont a = a.append("123");
        System.out.println(a);
        
        StringBuilder b = new StringBuilder("pqr");
        b.append("123");
        System.out.println(b);
    }
    
}
