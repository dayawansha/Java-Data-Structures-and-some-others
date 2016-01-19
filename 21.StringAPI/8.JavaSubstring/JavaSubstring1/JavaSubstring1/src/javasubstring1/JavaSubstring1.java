package javasubstring1;

public class JavaSubstring1 {

      public static void main(String[] args) {
          String a = "abcdef";
          String b = "0123456";
          
          a = a.substring(2);          
          b = b.substring(0,3);
          
          System.out.println(a);
          System.out.println(b);
          System.out.println(b.length());
         
    }
    
}
