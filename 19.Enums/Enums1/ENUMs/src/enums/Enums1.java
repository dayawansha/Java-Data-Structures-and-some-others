package enums;
 
enum ShartSize { Small, Medum, Large  };

public class Enums1 {
    
    enum Days { Sunday, Monday, Tuesday, Wednesday  };
    
    public static void main(String[] args) {
            System.out.println(ShartSize.Medum);
            System.out.println(Days.Wednesday);
            
            System.out.println(new Enums1());
            System.out.println(new Enums1());
    }
}
