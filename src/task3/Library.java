package task3;

public class Library {

	
	  private Book[] books;
	    private int size;

	    public Library(int capacity) {
	        this.books = new Book[capacity];
	        this.size = 0;
	    }

	    public void addBook(Book book) {
	        if (size < books.length) {
	            books[size] = book;
	            size++;
	            System.out.println("Book added successfully.");
	        } else {
	            System.out.println("Library is full. Cannot add more books.");
	        }
	    }

	    public void removeBook(int bookID) {
	        for (int i = 0; i < size; i++) {
	            if (books[i].getBookID() == bookID) {
	                books[i] = books[size - 1];
	                size--;
	                System.out.println("Book removed successfully.");
	                return;
	            }
	        }
	        System.out.println("Book with ID " + bookID + " not found.");
	    }

	    public void searchBook(int bookID) {
	        for (int i = 0; i < size; i++) {
	            if (books[i].getBookID() == bookID) {
	                System.out.println("Book found:\n" + books[i]);
	                return;
	            }
	        }
	        System.out.println("Book with ID " + bookID + " not found.");
	    }

	    public void displayBooks() {
	        if (size == 0) {
	            System.out.println("No books in the library.");
	            return;
	        }
	        System.out.println("Books in the library:");
	        for (int i = 0; i < size; i++) {
	            System.out.println(books[i]);
	        }
	    }
	}




