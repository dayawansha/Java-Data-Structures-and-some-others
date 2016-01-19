package stringbuilderbuffer$insert;
 
public class StringBuilderBuffer$Insert {

     public static void main(String[] args) {
     
         StringBuffer a = new StringBuffer("0123456789");
         a.insert( 4 , "---------");
         System.out.println(a);
         
          StringBuilder b = new StringBuilder("0123456789");
         b.insert( 4 , "---------");
         System.out.println(b);
    }
    
}
