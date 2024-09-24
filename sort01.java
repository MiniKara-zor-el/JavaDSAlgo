package arraysintro;
import java.util.Scanner;
public class sort01 {

	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
            arr[i] = 0; 
		}
		for(int i = count; i < arr.length; i++){ 
			arr[i] = 1; 
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
	        sortZeroesAndOne(arr);
	        printArray(arr);
	    }
}

