
package gymmembershipmeanagementsystemmain;

public class Member
{
    
    
    private long memberID;
    private String memberName;
    private int noOfMonths;
    
    Member(long memberID,String memberName,int noOfMonths)
    {
        this.memberID=memberID;
        this.memberName=memberName;
        this.noOfMonths=noOfMonths;
    
    }
    
    void setMemberID(long memberID)
    {
        this.memberID=memberID;
    }
    void setMemberName(String memberName)
    {
        this.memberName=memberName;;
    }
    void setNoOfMonths(int noOfMonths)
    {
        this.noOfMonths=noOfMonths;
    }
    
    long getMemberID()
    {
    return memberID;
    }
    String getMemberName()
    {
    return memberName;
    }
    int getNoOfMonths()
    {
    return noOfMonths;
    }
    
    
    void display()
    {
        System.out.println("Member ID"+memberID);
        System.out.println("Member Name"+memberName);
        System.out.println("No of Months"+noOfMonths);
    }
    
}
