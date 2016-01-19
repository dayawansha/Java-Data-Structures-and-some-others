package wrapperclsd;

public class WrapperClsD {

    public static void main(String[] args) {

        Boolean a = new Boolean(true);      //   Boolean a = true;
        Boolean b = new Boolean(false);     //   Boolean b = false;
        Boolean c = new Boolean("true");    //   Boolean c = Boolean.valueOf("true");
        Boolean d = new Boolean("FaLse");   //   Boolean d = Boolean.valueOf("FaLse");
        Boolean e = new Boolean("AB123@");  //   Boolean e = Boolean.valueOf("AB123@");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

}
