package bTap;

public class TestBook {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');

        // Creating an instance of Book
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        System.out.println(aBook);  // Output using toString()

        // Accessing author's details from the book instance
        System.out.println("Author's name: " + aBook.getAuthorName());
        System.out.println("Author's email: " + aBook.getAuthorEmail());
        System.out.println("Author's gender: " + aBook.getAuthorGender());

        // Using anonymous author
        Book anotherBook = new Book("More Java for dummy", new Author("Paul Tan", "paul@nowhere.com", 'm'), 29.95, 888);
        System.out.println(anotherBook);  // Output using toString()
    }

}
