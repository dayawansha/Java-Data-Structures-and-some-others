package javaapplication124;

public class StringConcat {
 
    public static void main(String[] args) {
         
        String a  = "abc";
        String b = a.concat("DEF");
        a  = a.concat("DEF");
        System.out.println(a);
        System.out.println(b);
    }
    
}
