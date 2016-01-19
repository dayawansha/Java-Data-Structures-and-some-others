package comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {

    String name;
    int age;

    Person(String s, int t) {
        name = s;
        age = t;
    }
    @Override
    public String toString() {
        return name+ "  "  + age;
    }}

class A implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        return a.name.compareTo(b.name);
 }}

class B implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        return b.name.compareTo(a.name);
 }}

class C implements Comparator<Person>{
    @Override
    public int compare(Person a, Person b){
        if(a.age == b.age) 
            return 0;
        else if (a.age > b.age)
            return -1;
        else 
            return 1;
 }}

public class Comparator2 {

    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<Person>();
        p.add(new Person("A", 23));
        p.add(new Person("Z", 24 ));
        p.add(new Person("W", 22));

        System.out.println(" Start      " + p);
        
        Collections.sort(p, new A());
        System.out.println(" A sequence "+p);
        
        Collections.sort(p, new B());
        System.out.println(" B sequence "+ p);
        
        Collections.sort(p, new C());
        System.out.println(" C sequence "+ p);

    }
}
