package labAssignment1;

public class Pascal {
	private int n;
	private int arr[][];
	
	public Pascal(int n) {
		this.n = n;
		arr = new int[n][n];
	}
	
	public void makeTraingle() {
		for(int line=0;line<n;line++) {
			for (int i = 0; i <= line; i++) 
	        { 
	        if (line == i || i == 0) 
	            arr[line][i] = 1; 
	        else
	            arr[line][i] = arr[line - 1][i - 1] +  
	                            arr[line - 1][i]; 
	        System.out.print(arr[line][i] + " "); 
	        }
			System.out.println();
		}
	}
}
