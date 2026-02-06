
package encapsulation;


public class Encapsulation {

    public static void main(String[] args)
    {
        
        Person p = new Person();
        String name = p.getName();
        System.out.println(name);
        p.setName("John");
        p.setAge(21);
        name = p.getName();
        System.out.println(name);
        int age =p.getAge();
        System.out.println(age);
        
        
        
        
    }
    
}
