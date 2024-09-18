package arraysintro;

import java.util.Scanner;

public class SwapAlternateNumbers {
	
	public static void swapAlternate(int arr[]) {
		
		int n = arr.length;
	    for(int i=0; i<n-1; i+=2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1]= temp;
		}
	}
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		
	}return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = takeInput();
        swapAlternate(arr);
        printArray(arr);
	}

}
