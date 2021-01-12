package labAssignment1;

public class CopyArray {
	
	public static int[] makeNewArray(int arr[]){
		int newarr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newarr[i] = arr[i];
		}
		return newarr;
	}
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
