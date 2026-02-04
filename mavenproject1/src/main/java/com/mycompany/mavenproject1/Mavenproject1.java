/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;


import java.util.Arrays;
/**
 *
 * @author Aathithya Pandiyan K
 */
public class Mavenproject1 {

    public static void main (String [] args)
	{
		
		int array [] = {10,2,3,67,89,90,32};
		Mavenproject1 ms = new Mavenproject1();
		int newArray[] = ms.divide (array);
		ms.print(newArray);
		
		
	}
	
	int[] divide (int array[])
	{
		
		if (array.length==1)
		{
			return array;
		}
		
		int mid = array.length / 2 ;
		int left [] = divide(Arrays.copyOfRange(array,0,mid));
		int right [] = divide(Arrays.copyOfRange(array,mid,array.length));
		
		return merge (left,right);
		
		
		
	}
	
	int[] merge (int left[],int right[])
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int newArray [] = new int [left.length+right.length];
		while (i<left.length && j<right.length)
		{
			
			if (left[i]<right[j])
			{
				newArray[k]=left[i];
				i++;
				k++;
			}
			else if (left[i]>right[j])
			{
				newArray[k]=right[j];
				j++;
				k++;
			}
		}
		
		while (i<left.length)
		{
			
			newArray[k]=left[i];
			i++;
			k++;
		}	
		while (j<right.length)
		{
			
			newArray[k]=right[j];
			j++;
			k++;
		}	
		
		
		
		
		return newArray;
		
		
	}
	
	void print(int newArray[])
	{
		
		for (int a : newArray)
		{
			System.out.println(a+ " ");
			
		}
		
	}
	
	
	
	
	
}
