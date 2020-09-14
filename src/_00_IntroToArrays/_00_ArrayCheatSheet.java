package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] array1 = new String[5];
		// 2. print the third element in the array
		System.out.println(array1[2]);
		// 3. set the third element to a different value
		array1[2] = "hello";
		// 4. print the third element again
		System.out.println(array1[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		String b = new String("hey");
		for (int a = 0; a < array1.length; a++) {
			array1[array1.length] = b;
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int c = 0; c < array1.length; c++) {
			System.out.println(array1.length);
		}
		// 7. make an array of 50 integers
		int[] array2 = new int[50];
		// 8. use a for loop to make every value of the integer array a random number

		// 9. without printing the entire array, print only the smallest number on the
		// array

		// 10 print the entire array to see if step 8 was correct

		// 11. print the largest number in the array.

		// 12. print only the last element in the array

	}
}
