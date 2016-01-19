package regularexpressions21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions2 {

    
    public static void main(String[] args) {
         
        
        Pattern p = Pattern.compile("\\d");
    Matcher m = p.matcher("s98sd7");
    while(m.find()){
        System.out.print("index :" + m.start() + "   ");
        System.out.println("digit : " + m.group() );
    }
    
}}
