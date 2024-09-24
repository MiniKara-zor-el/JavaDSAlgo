package arraysintro;

import java.util.Scanner;

public class intersections {
	
	public static void intersections(int arr1[], int arr2[]) {
		//boolean foundIntersection = false;
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i] + " ");
					arr2[j]=Integer.MIN_VALUE;
					//foundIntersection = true;
					break;
				}
			}
		}
		//return foundIntersection;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter the size of the array: ");
	    int n1 = s.nextInt();
	    
	    int[] arr1 = new int[n1];

	    System.out.println("Enter the elements of the array: ");
	    for (int i = 0; i < n1; i++) {
	      arr1[i] = s.nextInt();
	    }
	    
	    System.out.print("Enter the size of the array: ");
	    int n2 = s.nextInt();
	    int[] arr2 = new int[n2];

	    System.out.println("Enter the elements of the array: ");
	    for (int i = 0; i < n2; i++) {
	      arr2[i] = s.nextInt();
	    }


	    intersections(arr1, arr2);
	

	}

}
