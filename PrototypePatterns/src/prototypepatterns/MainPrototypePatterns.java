
package prototypepatterns;


public class MainPrototypePatterns {

    
    public static void main(String[] args) throws CloneNotSupportedException
    {
        
        
        
        
        CollegeDetails cd = new CollegeDetails("Aathithya", "23mim01");
        System.out.println(cd.collegeName);
        System.out.println(cd.Name);
        System.out.println(cd.RollNo);
//        CollegeDetails cd1 = (CollegeDetails) cd.cloneDetails();
        CollegeDetails cd1 =  cd.clone();
        cd1.Name="Pandiyan";
        cd1.RollNo="20mic01";
        System.out.println(cd1.collegeName);
        System.out.println(cd1.Name);
        System.out.println(cd1.RollNo);
        
        
        
        System.out.println(cd==cd1);
        
        
        
        
        
        
        
    }
    
}
