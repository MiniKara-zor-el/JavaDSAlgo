package arraysintro;

import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1; i<arr.length; i++) {
			int j = i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
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
        insertionSort(arr);
        printArray(arr);
    }

}
