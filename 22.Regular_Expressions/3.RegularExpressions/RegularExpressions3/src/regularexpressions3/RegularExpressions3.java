package regularexpressions3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions3 {

    public static void main(String[] args) {
    Pattern p = Pattern.compile ("0[xX][0-9a-fA-F]");
    Matcher m = p.matcher("01 01x 0x 0Xf 0xg");
    while(m.find()){
       // System.out.println("aaaa");
        System.out.print("index :" + m.start() + "   ");
        System.out.println("digit : " + m.group() );
    }
    
}
}
