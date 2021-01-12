package labAssignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BookStore {
    private ArrayList<Book> books = new ArrayList<Book>();
	
	public BookStore() {}
	
	public void initializeBookStore() {
		ArrayList<Book> newBooks = new ArrayList<Book>();
		newBooks.add(new Book("Classic Novels","George Orwell","123",20));
		newBooks.add(new Book("The Lord of the Rings","J.R.R. Tolkien","145",10));
		newBooks.add(new Book("The Kite Runner","Khaled Hosseini","333",15));
		newBooks.add(new Book("Harry Potter","J.K. Rowling","345",4));
		newBooks.add(new Book("Slaughterhouse-Five","Kurt Vonnegut","234",12));
		this.books = newBooks;
	}
	
	public void sell(String bookTitle,int numOfCopies) throws IOException {
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		boolean bookFound = false;
		for(int i=0;i<books.size();i++) {
			
			if(books.get(i).getBookTitle().equals(bookTitle)) {
				bookFound = true;
				if(books.get(i).getNumOfCopies() < numOfCopies) {
					System.out.println("Sorry, you don't have sufficient number of copies in your bookstore");
					if(books.get(i).getNumOfCopies() != 0) {
					System.out.println("Do you want to sell remaining books ? Choose option");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					int option = Integer.parseInt(s.readLine());
					if(option == 1) {
						System.out.println("Ok Process! You have sold " + books.get(i).getNumOfCopies() + " copies of \"" + bookTitle + "\"");
						books.get(i).setNumOfCopies(0);
					}else {
						System.out.println("We are terminating your request to sell books. Thanks!");
					}
					
					}
					if(books.get(i).getNumOfCopies() == 0) {
						books.remove(i);
					}
					return;
				}else {
					books.get(i).setNumOfCopies(books.get(i).getNumOfCopies() - numOfCopies);
					System.out.println("Ok Process! You have sold " + numOfCopies + " copies of \"" + bookTitle + "\"");
					if(books.get(i).getNumOfCopies() == 0) {
						books.remove(i);
					}
					return;
				}
			}
		}
		
		if(!bookFound) {
			System.out.println("You don't have any book name \"" + bookTitle + "\"");
		}
		s.close();
	}
	
	public void order(String ISBN,int numOfCopies) throws IOException{
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		boolean bookFound = false;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).getISBN().equals(ISBN)) {
				bookFound = true;
				books.get(i).setNumOfCopies(books.get(i).getNumOfCopies() + numOfCopies);
				System.out.println("You have Successfully purchased " + numOfCopies + " copies of \"" + books.get(i).getBookTitle() + "\"");
				break;
			}
		}
		if(bookFound == false) {
			String newBookTitle;
			String newBookAuthor;
			System.out.println("Please enter new book title and Author: ");
			newBookTitle = s.readLine();
			newBookAuthor = s.readLine();
			books.add(new Book(newBookTitle,newBookAuthor,ISBN,numOfCopies));
			System.out.println("You have Successfully purchased " + numOfCopies + " copies of \"" + newBookTitle + "\"");
		}
	}
	
	public void display() {
		if(books.size() == 0) {
			System.out.println("Your Book Store is empty!");
			return;
		}
		for(int i=0;i<books.size();i++) {
			System.out.println(books.get(i).getBookTitle() + " -- " + books.get(i).getAuthor() + " -- " + books.get(i).getISBN() + " -- " + books.get(i).getNumOfCopies());
		}	
	}

}
