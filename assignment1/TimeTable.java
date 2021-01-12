package labAssignment1;

public class TimeTable {
	private int arr[][];
	private int n;
	
	public TimeTable(int n) {
		arr = new int[n+1][n+1];
		this.n = n;
	}
	public void makeTable() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				arr[i][j] = i*j;
			}
		}
	}
	
	public void showTable() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
