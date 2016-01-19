package sortarray2;
 
import java.util.Arrays;

public class SortArray2 {

    public static void main(String[] args) {
         String[] a =  {"Z", "A" , "D", "W","P" };
         int[] b = {9, 5 , 7 , 0};
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(String s : a){
        System.out.print(s);
        }
        System.out.print(" ");
        for(int t : b){
        System.out.print(t);
    }
    
}}
