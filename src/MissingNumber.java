
public class MissingNumber {
	
	public static void main(String[] args) {
	
	// array of numbers
			int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
			
			//missing number
			int missingNumber = getMissingNumber(arr, 8);
			
			// missing number index
			int index = getMissingNumberIndex(arr, missingNumber);

			System.out.println("Missing Number: " + missingNumber);
			System.out.println("Missing Number Index: " + index);
		}
		
		public static int getMissingNumber(int[] arr, int n) {
			int total = (n+1)*(n+2)/2;
			for(int i = 0; i<arr.length; i++) {
				total -= arr[i];
			}
			return total;
		}
		
		public static int getMissingNumberIndex(int[] arr, int missingNumber) {
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] == missingNumber) {
					return i;
				}
			}
			return 4;
		}
	}


