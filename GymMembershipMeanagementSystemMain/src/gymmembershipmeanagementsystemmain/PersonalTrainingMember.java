
package gymmembershipmeanagementsystemmain;


public class PersonalTrainingMember extends Member implements GymRules
{
    double regularMemberFees ;
    String type;

    public PersonalTrainingMember(long ID , String Name , int months,String type)
    {
        super(ID,Name,months);
        this.type = type;
    }
    
    
    
    public void calculateFees()
    {
      regularMemberFees = getNoOfMonths()*2500;
    }
    
    
    public void display()
    {
        System.out.println("Member ID"+getMemberID());
        System.out.println("Member Name"+getMemberName());
        System.out.println("No of Months"+getNoOfMonths());
        System.out.println("Type"+type);
        System.out.println("Regular Membership fees for"+getNoOfMonths()+"is"+" "+regularMemberFees);
    }
}
