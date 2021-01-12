package labAssignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookStoreTester {
	public static void main(String[] args) throws NumberFormatException,IOException {
		System.out.println("Enter 1 to display the Books: Title-Author-ISBN-Quantity");
		System.out.println("Enter 2 to order new Books");
		System.out.println("Enter 3 to sell Books");
		System.out.println("Enter 0, to Exit the System");
		
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(s.readLine());
		BookStore bs = new BookStore();
		bs.initializeBookStore();
		
		while(num!=0) {
			switch(num) {
				case 1: bs.display();
				break;
				
				case 2: 
					System.out.println("Please enter the ISBN number and quantity of books: ");
					String isbn = s.readLine();
					int orderQuantity = Integer.parseInt(s.readLine());
					bs.order(isbn, orderQuantity);
				break;
					
				case 3: 
					System.out.println("Please enter the Book Title & quantity of books: ");
					String bookTitle = s.readLine();
					int sellQuantity = Integer.parseInt(s.readLine());
					bs.sell(bookTitle, sellQuantity);
				break;
				
				case 0:
				break;
				
				default: System.out.println("Invalid Input!!");
				break;
			}
			System.out.println("Continue ? ");
			System.out.println("1. Yes");
			System.out.println("2. No ");
			int choice = Integer.parseInt(s.readLine());
			if(choice == 1) {
				num = Integer.parseInt(s.readLine());
			}else {
				break;
			}
			
		}
		s.close();
		System.out.println("Thank you for the services. Bye!");
	}

}
