package objectmethodes;
 public class ToStringCls {
     
     String name; 
     int age ;
     ToStringCls (String a , int b){
     this.name = a;   //   name = a;    meyada pramanawath
     this.age = b;    //   age = b;     
     }  
     
     @Override
     public String toString(){
         return  name + "  " + age   ;
         
     }
    public static void main(String[] args) {
       ToStringCls a = new ToStringCls("Dushman", 23);
       ToStringCls b = new ToStringCls("Nalin", 23);
       
       System.out.println(a);
       System.out.println(b);      
    }  
}
