
package WordLocationArraysums;

import java.util.Arrays;


public class ArrayArranger 
{
    
    String sentence ;
    String arrays[] ;
    String sentenceArrayResult [] ;

    public ArrayArranger(String sentence) 
    {
        this.sentence = sentence;
        this.arrays=sentence.split(" ");
        this.sentenceArrayResult= new String[arrays.length];
    }
    
    
    void arrayArranger()
    {
        
        
        for(int i = 0 ; i<arrays.length;i++)
        {
            String word = arrays[i];
            int position = 0;
            String wordWithoutNumber = "";
            
            
            for(int j = 0 ;j<word.length();j++)
            {
                char character = word.charAt(j);
                
                if(character >='0' && character<='9')
                {
                  position = character - '0';  
                }
                else
                {
                    wordWithoutNumber+=character;
                }
                
            }
            
            sentenceArrayResult[position]=wordWithoutNumber;
        }
        
        for(int i = 0 ; i < sentenceArrayResult.length;i++)
        {
           System.out.print(sentenceArrayResult[i]+"  ");
        
        }
        System.out.println(" ");
        
    
    
    }
    

}
