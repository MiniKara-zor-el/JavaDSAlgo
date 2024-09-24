package arraysintro;

import java.util.Scanner;

public class TripletSum {
	
	public static int findTriplet(int arr[], int n, int x) {
		int counter = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						counter++;
					}
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
	    
	    int count = findTriplet(arr, n, sum); // call method and store count
	    System.out.println("Total pairs with sum " + sum + ": " + count);
	    
	  }

}
