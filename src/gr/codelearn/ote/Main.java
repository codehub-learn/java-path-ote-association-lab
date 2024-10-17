package gr.codelearn.ote;

import gr.codelearn.ote.domain.Book;
import gr.codelearn.ote.domain.Car;
import gr.codelearn.ote.domain.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("To kill a Mockingbird", "Harper Lee", 281);

        Library library = new Library("National Library of Greece", "Stadiou 2, Athens, Greece");
        Library library2 = new Library("Athens Library", "Stadiou 1, Athens, Greece");

        library.addBook(book1, 1);
        library.addBook(book2, 2);

        library2.addBook(book1, 1);

        library.displayLibrary();

        System.out.println();

        Car car = new Car("Model S", "Tesla", "Electric", 1020);
        car.startCar();
        car.showCarDetails();
    }
}
