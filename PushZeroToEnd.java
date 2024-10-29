package arraysintro;

import java.util.Scanner;

public class PushZeroToEnd {

	public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
		int placeNonZeroHere = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=0) {
				//swap the element
				int temp = arr[i];
				arr[i]=arr[placeNonZeroHere];
				arr[placeNonZeroHere]=temp;
				placeNonZeroHere++;
			}
			
		}
		
    }
	
	public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = s.nextInt();
        }
        return arr;
    }

	public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {

        int[] arr = takeInput();
        pushZerosAtEnd(arr);
        printArray(arr);
    }



}
