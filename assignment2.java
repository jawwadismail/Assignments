import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		Book1 book1 = new Book1("My Brilliant Life", "Kim Ae-ran", 2, 1000);
		Book1 book2 = new Book1("Made in Korea", "Sarah Suk", 3, 1200);
		Book1 book3 = new Book1("I'll Be the One", "Lyla Lee", 4, 1100);
		Book1 book4 = new Book1("Somewhere Only We Know", "Maurene Goo", 3, 1300);

		HashMap<Integer, Book1> bookShelf = new HashMap<Integer, Book1>();
		bookShelf.put(1, book1);
		bookShelf.put(2, book2);
		bookShelf.put(3, book3);
		bookShelf.put(4, book4);

		Scanner s = new Scanner(System.in);

		Integer isbn_test = s.nextInt();

		if (bookShelf.containsKey(isbn_test)) {
			Book1 theBook = bookShelf.get(isbn_test);
			System.out.println("Book : " + theBook);
		} else {
			System.out.println("Key not found ");
		}

		System.out.println("---------------");
		Set<Integer> keySet = bookShelf.keySet();
		System.out.println(bookShelf.keySet());

		for (Integer theKey : keySet) {
			Book1 theCountry = bookShelf.get(theKey);
			System.out.println("Country : " + theCountry);
		}

	}

}

class Book1 {
	private String bookName;
	private String authorName;
	private double edition;
	private int noOfPages;

	public Book1(String bookName, String authorName, double edition, int noOfPages) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.edition = edition;
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "Book1 " + "BookName=" + bookName + ", authorName=" + authorName + ", edition=" + edition
				+ ", noOfPages=" + noOfPages + "]";
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getEdition() {
		return edition;
	}

	public void setEdition(double edition) {
		this.edition = edition;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

}