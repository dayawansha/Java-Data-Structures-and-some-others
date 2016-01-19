package stringbuilderbuffer$reverse;

public class StringBuilderBuffer$Reverse {
 
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("abc");
        a.reverse();
        System.out.println(a);
        
        StringBuilder b = new StringBuilder("abc");
        b.reverse();
        System.out.println(b);
    }
    
}
