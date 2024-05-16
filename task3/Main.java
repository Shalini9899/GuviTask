package task3;

public class Main {
	
	    public static void main(String[] args) {
	        Library library = new Library(10);

	        library.addBook(new Book(1, ". How to Win Friends and Influence People", " Dale Carnegie"));
	        library.addBook(new Book(2, "The Magic of Thinking Big", "David J. Schwartz"));
	        library.addBook(new Book(3, "Think and Grow Rich", "Napoleon Hill"));

	        library.displayBooks();

	        library.searchBook(2);

	        library.removeBook(2);

	        library.displayBooks();
	    }
	
	
}


