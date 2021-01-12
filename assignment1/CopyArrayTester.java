package labAssignment1;
import java.util.*;

public class CopyArrayTester {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		
		int newarr[] = CopyArray.makeNewArray(arr);
		
		newarr[n-1] = 100;
		CopyArray.printArray(arr);
		CopyArray.printArray(newarr);
		s.close();
		
	}
}
