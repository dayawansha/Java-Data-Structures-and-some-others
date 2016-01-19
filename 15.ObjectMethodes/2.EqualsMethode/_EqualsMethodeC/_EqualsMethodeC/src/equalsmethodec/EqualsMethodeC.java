 package equalsmethodec;
public class EqualsMethodeC {

    public static void main(String[] args) {
      Integer a = 20;    // Integer a = new Integer(10);
      Integer b = 20;
      Integer c = 30;
      Byte d = (byte) 10;
      
      System.out.println(a.equals(b));
      System.out.println(a.equals(c));
      System.out.println(a.equals(d));
    }
    
}
