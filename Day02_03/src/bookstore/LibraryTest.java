package bookstore;

public class LibraryTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Novel book = new Novel("Pride and Prejudice", "Jane Austen");

		book.lendBook("me");

		book.returnBook();

	}

}