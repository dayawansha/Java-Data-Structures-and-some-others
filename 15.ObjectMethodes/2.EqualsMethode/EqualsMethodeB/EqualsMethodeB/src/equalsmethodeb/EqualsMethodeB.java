package equalsmethodeb;

class PersonB {

    int age;
    
    PersonB(int a) {
        age = a;
    }
}

public class EqualsMethodeB {

    public static void main(String[] args) {
        
        PersonB a = new PersonB(23);
        PersonB b = new PersonB(23);
        PersonB c = a;
             
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));       
    }

}
