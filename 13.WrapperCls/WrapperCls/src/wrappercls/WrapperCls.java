package wrappercls;

public class WrapperCls {

    public static void main(String[] args) {

        Byte a = new Byte((byte)10);    ///   Byte a = (byte)10;
        Integer e = new Integer(30) ;   ///  Integer e = 25 ;
        Byte c = new Byte("127");
        
        System.out.println(a);
        System.out.println(e);
        System.out.println(c);
        
        Byte b = new Byte("ABC");   
        Byte d = new Byte("1000000");
        
        
    }

}
