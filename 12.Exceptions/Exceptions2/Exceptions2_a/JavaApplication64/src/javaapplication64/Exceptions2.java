
package javaapplication64;


public class Exceptions2 {

   
    public static void main(String[] args) {
     // throw new IOException();
      System.out.println("line special");
      
      throw new ArrayIndexOutOfBoundsException();   //  run time exception
      System.out.print("line x");
      System.out.print("line x");
      
      throw new IOException();      // compile time exception
      System.out.print("line y");
      System.out.print("line x");
    }
    
}
