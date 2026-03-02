
package MountainArrayQuestion;

import java.util.Arrays;


public class ArrayChecker 
{
    int array[] ;
    int highestNumber;
    int highestNumberIndex;

    public ArrayChecker(int array[]) 
    {
        this.array = array;
    }
    void mountainArrayChecker()
    {
        for(int i = 0; i<array.length;i++)
        {
            if(array[i]>highestNumber)
            {
              highestNumber=array[i];
              highestNumberIndex=i;
              
            }
        }
        
        if(highestNumberIndex == 0 || highestNumberIndex == array.length-1)
        {
            System.out.println("IT IS NOT MOUNTAIN ARRAY");
            return;
        }
        
        
        int left [] = (Arrays.copyOfRange(array,0, highestNumberIndex));
        int right [] =(Arrays.copyOfRange(array, highestNumberIndex, array.length));
        
//        int left [] = new int [highestNumberIndex];
//        int right [] = new int [array.length-highestNumberIndex];
//        
//        for(int i = 0 ; i<highestNumberIndex;i++)
//        {
//        left [i]=array[i];
//        }
//        
//        int j = 0;
//        for(int i = highestNumberIndex ; i<array.length;i++)
//        {
//        left [j]=array[i];
//        j++;
//        }
        
        for(int i = 0 ; i<left.length-1;i++)
        {
            if(left[i] >= left[i+1])
            {
                System.out.println("IT IS NOT MOUNTAIN ARRAY");
                return;
            }
        }
        for(int i = 0 ; i<right.length-1;i++)
        {
            if( right[i] <= right[i+1] )
            {
                
                System.out.println("IT IS NOT MOUNTAIN ARRAY");
                return;
            }
        }
        
        System.out.println("YES , IT IS MOUNTAIN ARRAY");
    }

}
