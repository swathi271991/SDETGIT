package PracticeJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count = 0;
		String input = "Java is a programming language Python is also a programming language";
		input = input.toLowerCase();	
	
		String[] strArray = input.split(" ");

		List<String> listOfWords = Arrays.asList(strArray);

		HashSet<String> uniqueWords = new HashSet<>(listOfWords);

		for(String word : uniqueWords)
		{
			if((Collections.frequency(listOfWords,word) > 1))
			{
				System.out.print(" "+word+"");
				
			}


		}





	}

}
