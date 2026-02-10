
package emsmain;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting extends Employee
{
    Scanner sc = new Scanner (System.in);
    Scanner sc1 = new Scanner (System.in);
    
    double j;
    double i;
    double temp;
    
    void sorting()
    {
        
        int choice ;
        do
        {
            System.out.println("1 for Bubble sorting");
            System.out.println("2 for Merge sorting");
            System.out.println("3 for exit sorting");
            System.out.println("enter ur choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :
                {
                    void bubbleSort(i)
                    {
                        
                        if(i<salary.length-1)
                        {
                            if(j<salary.length-1-i)
                            {
                                
                                if(salary[j]>salary[j+1])
                                {
                                    
                                    temp = salary[j];
                                    salary[j]=salary[j+1];
                                    salary[j+1]=temp;
                                }
                                ++j;
                                bubbleSort(i);
                            
                            }
                            
                            else
                            {
                                j=0;
                                i++;
                                bubbleSort(i);
                            
                            
                            }
                        }
                        
                        System.out.println("Salary is sorted");
                    }
                break;
                }
                
                
                case 2 :
                {
                    
                    
                     double[] divide()
                    {
                        
                        if(salary.length==1)
                        {
                            return salary ;
                        }
                        
                        double mid = salary.length/2;
                        double left[]=divide(Arrays.copyOfRange(salary,0,mid));
                        double right[]=divide(Arrays.copyOfRange(salary,mid,salary.length));
                        
                        return merge(left,right);
                    
                    }
                    
                    double[] merge(double[]left,double[]right)
                    {
                        
                        double i ;
                        double j ;
                        double k ;
                        
                        double newSalary[]=new double[left.length+right.length];
                        
                        while(i<left.length&&j<right.length)
                        {
                            
                            if(left[i]<=right[j])
                            {
                                newSalary[k]=left[i];
                                i++;
                                k++;
                            }
                            else
                            {
                                newSalary[k]=right[j];
                                j++;
                                k++
                            }
                            
                            
		            while (i<left.length)
		             {
			        newSalary[k]=left[i];
			        i++;
			        k++;
		             }
		            while (j<right.length)
		             {
		            	newSalary[k]=right[j];
		         	j++;
		        	k++;
		             }
                            return newSalary;
		
		
		
		
		
	}
                        
                        
                        }
                        
                        
                        
                        
                        
                    
                    
                    }
                    
                
                
                
                
                }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
            
        }while(choice!=3);
        
    
    
    
    
    
    
    
    
    }
    
}
