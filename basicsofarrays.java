package arraysintro;
import java.util.Scanner;

public class basicsofarrays {
	
	public static int sum(int[] arr) {
		//Your code goes here
		int n = arr.length;
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
			
		}
		return sum;
	}

	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		// int n =s.nextInt();
		int t = s.nextInt();
		int[] arr = new int[t];

		for(int i=0; i<t; i++){
			// System.out.println(t);

			arr[i] = s.nextInt();
		}
		return arr;
		
	}

	public static void main(String[] args){
		int[] arr = takeInput();
		int total_sum = sum(arr);
		System.out.println(total_sum);
	}

}
