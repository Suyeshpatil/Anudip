package AssignmentDec27;

public class Book {
	// Adding attributes
	private String name;
	private String author;
	private String isbn;

	// create constructor
	Book(String name, String author, String isbn) {
		this.name = name;
		this.author = author;
		this.isbn = isbn;
	}

//use of Getter setter
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public String getIsbn() {
//		return isbn;
//	}
//
//	public void setIsbn(String isbn) {
//		this.isbn = isbn;
//	}
//
//	@Override
//	public String toString() {
//		return String.format("Book [name=%s, author=%s, isbn=%s]", name, author, isbn);
//	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", isbn=" + isbn + "]";
	}

	public static void main(String[] args) {
		Book[] Books = new Book[] { new Book("My Journey", "Dr. A.P.J. Abdul Kalam", "0937496248"),
				new Book("Vivekadeepini", "Adi Shankaracharya", "09876544"),
				new Book("“Cricket World Cup: The Indian Challenge”", "Ashis Ray", "01234567") };
		for (Book i : Books) {
			System.out.println(i);
		}
	}
}

//output
//Book [name=My Journey, author=Dr. A.P.J. Abdul Kalam, isbn=0937496248]
//Book [name=Vivekadeepini, author=Adi Shankaracharya, isbn=09876544]
//Book [name=“Cricket World Cup: The Indian Challenge”, author=Ashis Ray, isbn=01234567]
