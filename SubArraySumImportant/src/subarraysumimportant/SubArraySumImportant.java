
package subarraysumimportant;


public class SubArraySumImportant {

    
    public static void main(String[] args)
    {
        
        int array[] ={1,2,3,4,5};
        
        
        for(int i =0;i<array.length;i++)
        {
            for(int j = 0;j<array.length;j++)
            {
                if(j==0)
                {
                    int subArray[]=new int [array.length];
                    subArray[i]=array[i];
                    System.out.println(subArray[i]);
                }
                else if(j==1)
                {
                    int subArray2[]=new int[array.length];
                    subArray2[i]=array[i];
                    subArray2[j]=array[j];
                    System.out.println(subArray2[i]+ " "+subArray2[j]);
                }
                else if(j==2)
                {
                    int subArray2[]=new int[array.length];
                    subArray2[i]=array[i];
                    subArray2[j-1]=array[j-1];
                    subArray2[j]=array[j];
                    System.out.println(subArray2[i]+ " "+subArray2[j-1]+" "+subArray2[j]);
                }
                else if(j==3)
                {
                    int subArray2[]=new int[array.length];
                    subArray2[i]=array[i];
                    subArray2[j-1]=array[j-1];
                    subArray2[j-2]=array[j-2];
                    subArray2[j]=array[j];
                    System.out.println(subArray2[i]+ " "+subArray2[j-1]+" "+subArray2[j-2]+" "+subArray2[j]);
                }
                else if(j==4)
                {
                    int subArray2[]=new int[array.length];
                    subArray2[i]=array[i];
                    subArray2[j]=array[j];
                    subArray2[j-1]=array[j-1];
                    subArray2[j-2]=array[j-2];
                    subArray2[j-3]=array[j-3];
                    System.out.println(subArray2[i]+ " "+subArray2[j-1]+" "+subArray2[j-2]+" "+subArray2[j-3]+""+subArray2[j]);
                }
                else if(j==5)
                {
                    int subArray2[]=new int[array.length];
                    subArray2[i]=array[i];
                    subArray2[j]=array[j];
                    subArray2[j-1]=array[j-1];
                    subArray2[j-2]=array[j-2];
                    subArray2[j-3]=array[j-3];
                    subArray2[j-4]=array[j-4];
                    System.out.println(subArray2[i]+ " "+subArray2[j-1]+" "+subArray2[j-2]+" "+subArray2[j-3]+""+subArray2[j-4]+""+subArray2[j]);
                }
            
            }
        }
        
    }
    
}
