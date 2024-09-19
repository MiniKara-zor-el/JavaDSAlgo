package arraysintro;

import java.util.Scanner;

public class PairSum {
	
	public static int pairSum(int arr[], int x) {
		int counter = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==x) {
					System.out.println(arr[i] + " " + arr[j]);
					counter++;
				}
			}
		}return counter;
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
	    
	    System.out.print("Enter sum number: ");
	    int sum = s.nextInt();
	    
	    int count = pairSum(arr, sum); // call method and store count
	    System.out.println("Total pairs with sum " + sum + ": " + count);
	    
	  }

}


