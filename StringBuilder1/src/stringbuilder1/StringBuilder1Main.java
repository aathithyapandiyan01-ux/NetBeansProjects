
package stringbuilder1;
import java.util.Scanner;

public class StringBuilder1Main {
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE SENTENCE");
        
        String sentence = sc.nextLine();
        String reverseSentence ="";
        
        StringBuilder sb = new StringBuilder(sentence);
        
        reverseSentence= sb.reverse().toString();
        System.out.println("before reverse order :"+""+sentence);
        System.out.println("reverse order :"+""+reverseSentence);
        
        
        
    }
    
}
