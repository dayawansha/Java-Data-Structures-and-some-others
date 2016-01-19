 package stringbuilder.buffer$delete;
 
public class StringBuilderBuffer$Delete {

    
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("0123456789");
        System.out.println(a.delete(4,8));
        
        StringBuffer b = new StringBuffer("0123456789");
        System.out.println(b.delete(4,8));
        
    }
    
}
