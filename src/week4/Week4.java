package week4;

import java.util.Arrays;

public class Week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create an array of int called ages that contains 
		//the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;

		//a. Programmatically subtract the value of the first element 
		//in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code). Print the result to the console.  
		
		int numSubtract = (ages[ages.length - 1]) - ages[0];
		//System.out.println(numSubtract);
		
		//b. Create a new array of int called ages2 with 9 elements 
		//(ages2 will be longer than the ages array, and have more elements).  
		
		int[] ages2 = new int[9];
		
		//i. Make sure that there are 9 elements of type int in this new array.  
		
		ages2[0] = 5;
		ages2[1] = 25;
		ages2[2] = 47;
		ages2[3] = 53;
		ages2[4] = 2;
		ages2[5] = 14;
		ages2[6] = 33;
		ages2[7] = 78;
		ages2[8] = 96;
		
		//i. Repeat the subtraction from Step 1.a. (Programmatically subtract 
		//the value of the first element in the new array ages2 from the last element of ages2). 
		
		int numSubtract2 = (ages2[ages2.length -1]) - ages2[0];
		//System.out.println(numSubtract2);
		
		//iii. Show that using the index values for the elements is dynamic 
		//(works for arrays of different lengths).
		
		//The .length method can be used to always get the length of an array and just by subtracting 1
		//because all array index's start at 0 it will always return the final element in an array
		//no matter the length. As well the index of the first element of an array always starts at 0. 
		
		//c. Use a loop to iterate through the array and calculate the average age. 
		//Print the result to the console.
		int ageSum = 0;
		
		for(int i = 0; i < ages.length; i++) {
			
			ageSum += ages[i];
		}
		//System.out.println(ageSum / ages.length);
		
		//2. Create an array of String called names that contains the following 
		//values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[5] = "Tommy";
		names[1] = "Tim";
		names[2] = "Sally";
		names[3] = "Buck";
		names[4] = "Bob";
		

		//a. Use a loop to iterate through the array and calculate the average 
		//number of letters per name. Print the result to the console.
		
		int nameSum = 0;
		
		for(int i = 0; i < names.length; i++) {
			nameSum += names[i].length();
		}
		//System.out.println(nameSum / names.length);

		//b. Use a loop to iterate through the array again and concatenate all the names together, 
		//separated by spaces, and print the result to the console.
		
		String nameConcat = "";
		
		for(int i = 0; i < names.length; i++) {
			nameConcat += names[i] + " ";
		}
		//System.out.println(nameConcat);
		
		//3. How do you access the last element of any array?
		//It can be accessed by using the .length method on the array then you have to subtract one 
		//due to index starting with 0
		String lastOfArray = names[names.length - 1];
		
		//4. How do you access the first element of any array?
		//the starting index of all arrays is always 0
		String startOfArray = names[0];

		//5. Create a new array of int called nameLengths. Write a loop to iterate 
		//over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengthArray = new int[6];
		
		for(int i = 0; i < names.length; i++) {
			int nameLength = names[i].length();
			nameLengthArray[i] = nameLength;
		}
		//System.out.println(Arrays.toString(nameLengthArray));
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum 
		//of all the elements in the array. Print the result to the console.
		
		int nameLengthSum = 0;
		
		for(int i = 0; i < nameLengthArray.length; i++) {
			nameLengthSum += nameLengthArray[i];
		}
		//System.out.println(nameLengthSum / nameLengthArray.length);
		
		//7. Write a method that takes a String, word, and an int, n, as arguments and 
		//returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
		//I expect the method to return “HelloHelloHello”).
		
		//System.out.println(wordConcatinator("Hello", 10));
				
		//8. Write a method that takes two Strings, firstName and lastName, 
		//and returns a full name (the full name should be the first and the last name 
		//as a String separated by a space).
		
		//System.out.println(fullName("Bindus", "Shaboinky"));
		
		//9. Write a method that takes an array of int and returns true if the sum of 
		//all the ints in the array is greater than 100.
		
		//System.out.println(lessThan100(ages));
		
		//10. Write a method that takes an array of double and returns the average of 
		//all the elements in the array.
		double[] doubleArray = new double[8];
		doubleArray[0] = 16.94;
		doubleArray[1] = 17.62;
		doubleArray[2] = 24.76;
		doubleArray[3] = 30.46;
		doubleArray[4] = 45.50;
		doubleArray[5] = 48.21;
		doubleArray[6] = 54.32;
		doubleArray[7] = 64.49;
		
		//System.out.println(arrAverage(doubleArray));		
		
		//11. Write a method that takes two arrays of double and returns true if the 
		//average of the elements in the first array is greater than the average of the 
		//elements in the second array.
		
		double[] doubleArray2 = new double[8];
		doubleArray2[0] = 7.64;
		doubleArray2[1] = 17.24;
		doubleArray2[2] = 24.57;
		doubleArray2[3] = 30.67;
		doubleArray2[4] = 38.90;
		doubleArray2[5] = 44.23;
		doubleArray2[6] = 56.78;
		doubleArray2[7] = 59.88;
		
		//System.out.println(arrAverageCompair(doubleArray, doubleArray2));
		

		//12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
		//and a double moneyInPocket, and returns true if it is hot outside and if 
		//moneyInPocket is greater than 10.50.
		
		//System.out.println(willBuyDrink(true, 11.48));

		//13. Create a method of your own that solves a problem. In comments, 
		//write what the method does and why you created it.
		
		//Grocery list that takes 3 items as well if the person is a store member.
		//if the customer is a store member it applies a discount and returns the total after the discount
		//has been applied
		
		System.out.println(groceriesList(false, 5.45, 3.99, 10.50));
	}
	
	//Methods
	
	//7. 
	public static String wordConcatinator(String word, int n) {
		String wordConcated = "";
		
		for(int i = 0; i <= n; i++) {
			wordConcated += word + " ";
		}
		return wordConcated;
	}
	//8.
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	//9.
	public static boolean lessThan100(int[] arr) {
		int arrSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}if(arrSum > 100) {
			return true;
		}else {
			return false;
		}
	}
	//10.
	public static double arrAverage(double[] arr) {
		double doubleSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			doubleSum += arr[i];
		}
		return doubleSum / arr.length;
	}
	//11.
	public static boolean arrAverageCompair(double[] arr, double[] arr2) {
		double arrSum = 0;
		double arrAverage = 0;
		double arr2Sum = 0;
		double arr2Average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		for(int i = 0; i < arr2.length; i++) {
			arr2Sum += arr2[i];
		}
		arrAverage += arrSum / arr.length;
		arr2Average += arr2Sum / arr2.length;
		if(arrAverage > arr2Average) {
			return true;
		}else {
			return false;
		}
	}
	//12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	//13.
	public static String groceriesList(boolean isMember, double item1, double item2, double item3) {
		double itemTotal = 0;
		itemTotal += item1 + item2 + item3; 
		if(isMember == true) {
			double discount = 0;
			discount += itemTotal * 0.15;
			itemTotal -= discount;
			return String.format("%.2f" , itemTotal);
		}
		else {
			return String.format("%.2f", itemTotal);
			}
	}
}
