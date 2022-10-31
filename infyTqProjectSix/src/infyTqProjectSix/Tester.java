package infyTqProjectSix;

public class Tester {
	public static void main(String args[]) {
		Author author1 = new Author("Joshua Bloch", "joshua@email.com", 'M');
		Book book = new Book("Effective Java", author1, 45.0, 15);
		book.displayAuthorDetails();
	}
}
