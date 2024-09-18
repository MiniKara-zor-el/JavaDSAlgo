package arraysintro;

import java.util.Scanner;

public class FindUnique {
	
	public static int findUnique(int[] arr){
		if (arr.length <= 0) {
	        System.err.println("Error: Array size must be positive.");
	        return -1;
	    }
		for(int i=0; i<arr.length; i++) {
			boolean foundduplicate = false;
			for(int j=0; j<arr.length; j++) {
				if(i!=j && arr[i]==arr[j]) {
					foundduplicate = true;
					break;
				}
			}
			if(!foundduplicate) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the size of the array: ");
	    int n = s.nextInt();
	    
	    if (n % 2 == 0) {
	      System.err.println("Error: Array size must be odd (2M+1).");
	      return;
	    }

	    int[] arr = new int[n];

	    System.out.println("Enter the elements of the array: ");
	    for (int i = 0; i < n; i++) {
	      arr[i] = s.nextInt();
	    }

	    int uniqueNumber = findUnique(arr);

	    if (uniqueNumber != -1) {
	      System.out.println("The unique number: " + uniqueNumber);
	    } else {
	      System.out.println("No unique number found.");
	    }
	}

}
