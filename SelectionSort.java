package arraysintro;

import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
        //Your code goes here
        int index;
        for(int i=0;i<arr.length-1;i++) 
        {
            index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index]) 
                {
                    index=j;
                }
            }

            int save=arr[i];
            arr[i]=arr[index];
            arr[index]=save;
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
        selectionSort(arr);
        printArray(arr);
    }
}
