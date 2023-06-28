import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		
		int [] a = {10,20,45,35,55};
		 Arrays.sort(a);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] +"   ");
		
			
		}
		
		int [] array= {0,1,0,2,1,0,1,0,2};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
			
		}
		
	
	}
	

}
