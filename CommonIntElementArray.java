package PracticeJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonIntElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7};
		int b[] = {1,2,3,6,7};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		Set<Integer> s = new HashSet<Integer>();		
		for(int i=0; i<a.length; i++)
		{
		for(int j=0; j<b.length; j++)
		{
		if(a[i]==b[j])
		{
		s.add(a[i]);
		break;
		}
		}
		}
		System.out.println(" ");

		for(int w :s)
		{
		System.out.print(w);
		}

		//arraysDemo(a,b);
	}

	private static void arraysDemo(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		HashSet set1 = new HashSet<>();
		HashSet set2 = new HashSet<>();
		
		
	
		for(int array1 : a)
		{
			set1.add(array1);
		}
		
		for(int array2 : b)
		{
			set2.add(array2);
		}
		
		set1.retainAll(set2);
		System.out.println(set1);
		
	}


}
