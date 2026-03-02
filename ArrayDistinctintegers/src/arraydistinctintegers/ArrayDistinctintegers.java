
package arraydistinctintegers;

import java.util.Arrays;


public class ArrayDistinctintegers {

    
    public static void main(String[] args) 
    {
        
        int numbers[] ={111, 222, 333, 4444, 666};
        
        int length = numbers.length;
        
        String number =Arrays.toString(numbers);
        
        
        char charArray[] = number.toCharArray();
        
        int distinctIntegers[] = new int [10] ;
        int index =0;
        
        
        for (int i = 0 ; i<charArray.length-1;i++)
        {
            if(charArray[i] >= '0' && charArray[i] <='9')
            {
                
                boolean exists = false;
                
                for(int k=0;k<index;k++)
                {
                    if(distinctIntegers[k] == (charArray[i]-'0'))
                    {
                        exists = true;
                        break;
                    }
                }
                
                if(!exists)
                {
                
            
                    for(int j = 0 ; j<charArray.length;j++)
                    {
                        if(charArray[i]==charArray[j] && charArray[i] >= '0' && charArray[i] <='9')
                        {
                            distinctIntegers[index]=charArray[i];
                            index++;
                        }
                    }
                }
            }
        
        
        
        }
        
        System.out.println(Arrays.toString(distinctIntegers));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Given an array nums of positive integers of size N. Find all distinct digits present in nums.
 

//Example 1:
//
//Input: nums = [131, 11, 48]
//Output: 1 3 4 8
//Explanation: 1, 3, 4, and 8 are only distinct
//digits that can be extracted from the numbers
//of the array.
//Example 2:
//
//Input: nums = [111, 222, 333, 4444, 666]
//Output: 1 2 3 4 6
//Explanation: 1, 2, 3, 4, and 6 are only distinct
//digits that can be extracted from the numbers
//of the array.
        
        
        
        
        
    }
    
}
