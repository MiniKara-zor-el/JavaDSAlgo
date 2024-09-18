package arraysintro;

import java.util.Scanner;

public class LinearSearch {

		
		public static int LinearSearch(int arr[], int x) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]==x) {
					return i;
				}
			}return -1;
		}
		
		public static int[] takeInput(){
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = s.nextInt();
			
		}return arr;
		// TODO Auto-generated method stub
		
	    }
	    
	    public static void main(String[] args) {
	 		Scanner s = new Scanner(System.in);
	 		int[] arr = takeInput();
	 		int element = s.nextInt();
	 		int result = LinearSearch(arr, element);
	 		System.out.println(result);
	 	}

}
