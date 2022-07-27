1``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````package PracticeJava;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {10, 3, 1 ,2 ,5, 6, 3, 9};
	      int [] arr = new int [] {5, 2, 8, 7, 1};     
	        int temp = 0;    
	            
	        //Displaying elements of original array    
	        System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	            
	        //Sort the array in descending order    
	        for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] < arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	            
	        System.out.println();    
	            
	        //Displaying elements of array after sorting    
	        System.out.println("Elements of array sorted in descending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	            
	              
	            
	        }  
	        
	        arrayAscSort(a); 
	}

	
	private static void arrayAscSort(int[] a) {
		// TODO Auto-generated method stub

		int temp;
		
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
			
			
		}
		 System.out.println();   
		 
		 System.out.println("Elements of array sorted in Ascending order: ");    
	        for (int i = 0; i < a.length; i++) {     
	            System.out.print(a[i] + " ");  
		
		
	        }
	}

}
