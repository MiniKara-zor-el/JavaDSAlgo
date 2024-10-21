package arraysintro;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
				
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
        bubbleSort(arr);
        printArray(arr);
    }

}
