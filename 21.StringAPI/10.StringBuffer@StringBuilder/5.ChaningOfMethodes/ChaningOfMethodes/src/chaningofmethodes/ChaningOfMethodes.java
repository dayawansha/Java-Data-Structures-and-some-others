package chaningofmethodes;

public class ChaningOfMethodes {

     
    public static void main(String[] args) {
        
        StringBuilder a = new StringBuilder("abc");
        a.append(123).reverse().insert(4, "======");    // you can set more methodes
        System.out.println(a);
        
        String b = "pqr";
        b = b.concat("123").toUpperCase().replace('P', 'a');
        System.out.println(b);
    }
    
}
