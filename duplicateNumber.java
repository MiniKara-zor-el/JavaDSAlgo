package arraysintro;

import java.util.Scanner;

public class duplicateNumber {
	
	public static int duplicateNumber(int arr[]) {
		if (arr.length <= 1) {
	        System.err.println("Error: Array size must be positive.");
	        return -1;
	    }
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}	
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the size of the array: ");
	    int n = s.nextInt();
	    
	    int[] arr = new int[n];

	    System.out.println("Enter the elements of the array: ");
	    for (int i = 0; i < n; i++) {
	      arr[i] = s.nextInt();
	    }

	    int DuplicateNumber = duplicateNumber(arr);

	    if (DuplicateNumber != -1) {
	      System.out.println("The duplicate number: " + DuplicateNumber);
	    } else {
	      System.out.println("No duplicate number found.");
	    }
	}


}
