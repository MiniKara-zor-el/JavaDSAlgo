package arraysintro;

import java.util.Scanner;

public class ArrangeArrayNumbers {
	
	public static void arrange(int[] arr, int n) {
		
		if (n <= 0) {
	        System.err.println("Error: Array size must be positive.");
	        return;
	    }
		
		int left = 0;
		int right = n-1;
		int counter = 1;
		
		while(left<right) {
			if(counter%2==1) {
				arr[left]=counter;
				counter += 1;
				left += 1;
			}else {
				arr[right] = counter;
				counter += 1;
				right -= 1;
			}
		}
		
		if (left == right) {
            arr[left] = counter;
		}
	}
	
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();

        int[] arr = new int[n]; 
        
        arrange(arr, n);

        System.out.println("The arranged array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
	}
}
