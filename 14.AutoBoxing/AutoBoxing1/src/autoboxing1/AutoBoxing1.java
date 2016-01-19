package autoboxing1; 
public class AutoBoxing1 {

    static void doStuff(int z) {
        int z2 = 5;
        System.out.println(z2 + z);
    }
    static Integer x;
    
    public static void main(String[] args) {
    /* Integer x = new Integer(21);
    // x = 30;
     x ++;
     
     Integer y = 55 ;
     
        System.out.println(x);
        System.out.println(y);*/
        
        doStuff(x);
    }   
}

 