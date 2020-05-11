package com.kodilla.patterns.singleton.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBook() {
        //Given
        Library library = new Library("My Library");
        Book book1 = new Book("Wiedżmin", "Andrzej Sapkowski", LocalDate.of(1995, 10, 25));
        Book book2 = new Book("Dżuma", "Albert Camus", LocalDate.of(1947, 01, 01));
        Book book3 = new Book("Harry Pooter", "J.K.Rowling", LocalDate.of(2000, 10, 20));

        library.getBooks().add(book1); //czemu nie można od razu 'add'
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My Library 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
//            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3); //bez get nie da sie usunac

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2,library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
