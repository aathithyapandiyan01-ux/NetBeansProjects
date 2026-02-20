
package string;

import java.util.Scanner;

public class String 
{

    
    public static void main(String[] args)
    {
    
    
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE");
        java.lang.String sentence = sc.nextLine();
        
        int charactersCount =0;
        int vowelsCount =0;
        
        for (int i =0;i<sentence.length();i++)
        {
            
            char character = sentence.charAt(i);
            
            if(character!= ' ')
            {
                charactersCount++;
            }
            
            if(character=='a'||character=='A'||character=='e'||character=='E'||character=='i'||character=='I'||character=='o'||character=='O'||character=='u'||character=='U')
            {
                vowelsCount++;
            }
        }
        
        
        java.lang.String []words=sentence.trim().split("\\s+");
        int wordCount = words.length;
        
        
        
        System.out.println("WORDS LENGTH"+""+wordCount);
        System.out.println("CHARACTERS COUNT"+""+charactersCount);
        System.out.println("VOWELS COUNT"+""+vowelsCount);
        
    }
}    
    
    
    
    
    

    
        
    
    

