
package SingleTonHomeworkHW;


public class UserSession 
{
    private static String name; 
    
    private UserSession()
    {
        System.out.println("USER SESSION CREATED ");
    }
    
    private static class InnerClass
    {
        private static UserSession us = new UserSession();
    }
    
    void setUserName(String name)
    {
        UserSession.name = name ;
    }
    void showUserName()
    {
        System.out.println("Name is :  "+UserSession.name);
    }
    public static UserSession getInstance()
    {
        return InnerClass.us;
    }

}
