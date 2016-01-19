package convert.array.to.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ConvertArrayToList {
    
    ConvertArrayToList(int x){}

    public static void main(String[] args) {
        
         ConvertArrayToList[] b = {  new ConvertArrayToList(1),  new ConvertArrayToList(2) , new ConvertArrayToList(3)};
         ArrayList<ConvertArrayToList> arrayList1 = new ArrayList<ConvertArrayToList> (Arrays.asList(b));
         
         String[] a =  {"abc", "pqr","xyz"};
         List list = Arrays.asList(a);
         
         for (String r : a){ System.out.println(r); }
         System.out.println();
        
         for (Object j : list){ System.out.println(list); }
         System.out.println();
                
         list.set(0, "AAA");
         a[2] = "BBB";
         
         for (String i : a){ System.out.println(i); }
         System.out.println();
         
         for (Object i : list){ System.out.println(list);}
    }    
}
