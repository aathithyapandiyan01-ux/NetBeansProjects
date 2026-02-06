
package sportsacademy;

public class Player extends Person implements AcademyRules
{

    private String Sport ;

    public Player( String playerName,int age,String playerSports) {
        super(playerName,age);
        this.Sport = playerSports;
    }
    
    
    @Override
    public void followrules()
    {
        System.out.println("######PLAYER DETAILS######");
        System.out.println("NAME OF THE PLAYER :"+""+Name);
        System.out.println("AGE OF THE PLAYER :"+""+Age);
        System.out.println("SPORT HE IS PLAYING :"+""+Sport);
        System.out.println("THE PLAYER MUST ATTEND THE DAILY PRACTICE");
    
    
    
    }
    
    
    
}
