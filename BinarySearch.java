package arraysintro;
import java.util.Scanner;

public class BinarySearch {

	public static int search(int[] arr, int target) {
        // Write your code here.
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                    return mid;
            }
            if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }

        }
        return -1;
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
 		int result = search(arr, element);
 		System.out.println(result);
 	}
}
