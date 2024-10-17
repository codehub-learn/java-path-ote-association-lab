package gr.codelearn.ote.domain;

public class Library {
    private String name;
    private String address;
    private Book book1; // Aggregation with the Book class
    private Book book2;
    private Book book3;
    private Book book4;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addBook(Book book, int slot) {
        if (slot == 1) {
            book1 = book;
        } else if (slot == 2) {
            book2 = book;
        } else if (slot == 3) {
            book3 = book;
        } else if (slot == 4) {
            book4 = book;
        }
    }

    public void displayLibrary() {
        System.out.println("Library: " + name + " at " + address);
        System.out.println("Books in the Library:");
        if (book1 != null) {
            System.out.println(book1);
        }
        if (book2 != null) {
            System.out.println(book2);
        }
        if (book3 != null) {
            System.out.println(book3);
        }
        if (book4 != null) {
            System.out.println(book4);
        }
    }
}
