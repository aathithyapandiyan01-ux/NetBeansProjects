
package gammatestpasswordquestion;


public class PasswordChecker 
{
    
    String passWord ;

    public PasswordChecker(String passWord) 
    {
        this.passWord = passWord;
    }
    
    int alphabetCount ;
    int NumbersCount ;
    int characterCount ;
    
    
    
    void checkPassWord()
    {
        
        if(passWord.length()>=4 && passWord.length()<=10)
        {
            System.out.println("PASSWORD LENGTH IS CORRECT");
            
            
           
                
            for(int i = 0 ; i<passWord.length();i++)
            {
                    
               if(passWord.charAt(i)>='a'  &&  passWord.charAt(i)<='z' )
               {
                    alphabetCount++;
               }
               else if(passWord.charAt(i)>='A'  &&   passWord.charAt(i)<='Z' )
               {
                   alphabetCount++;
               }
            }
            for(int i = 0 ; i <passWord.length();i++)
            {
            
               if(passWord.charAt(i)>='0'  &&  passWord.charAt(i)<='9' )
               {
                    NumbersCount++;
               }
               
            }
            for(int i = 0 ; i <passWord.length();i++)
            {
            
               if(passWord.charAt(i)=='$'   )
               {
                    characterCount++;
               }
               
            }
            
            
            if(alphabetCount==0)
            {
                System.out.println("PASSWORD CONTAINS NO ALPHABETS");
                return ;
            }
            if(NumbersCount==0)
            {
                System.out.println("PASSWORD CONTAINS NO NUMBERS");
                return ;
            }
            
            if(passWord.contains("$"))
            {
                System.out.println("Password contains illegel characters");
            }
            else
            {
                System.out.println("UR PASSWORD IS CORRECT");
            }
                    
        }
        else
        {
            System.out.println("PASSWORD LENGTH IS INCORRECT");
        }
            
    }    
        
        
        
        
       
    
    

}
