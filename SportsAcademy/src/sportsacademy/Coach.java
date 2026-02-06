
package sportsacademy;

public class Coach extends Person implements AcademyRules
{
    private String Specialization ;
    
    Coach(String coachName,int age,String coachSpecialization)
    {
        super(coachName,age);
        this.Specialization=coachSpecialization;
    
    }
    
    @Override
    public void followrules()
    {
        System.out.println("######COACH DETAILS######");
        System.out.println("NAME OF THE COACH :"+""+Name);
        System.out.println("AGE OF THE COACH :"+""+Age);
        System.out.println("SPORT HE IS TEACHING :"+""+Specialization);
        System.out.println("THE COACH MUST TRAIN PLAYERS ON TIME  ");
    
    
    }
}
