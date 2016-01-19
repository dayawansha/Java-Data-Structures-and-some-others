package regulaterexperession;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaterExperession {
 
    public static void main(String[] args) {
        Pattern p  = Pattern.compile("ab");
        Matcher m = p.matcher("abaaaba");
        while(m.find()){
            System.out.println( m.start() + "  ");
        }
    }
    
}
