package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given
        Book book1 = new Book("Book1", "Author1", LocalDate.of(2012,1,1));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2013,2,3));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(2014,3,4));

        Library library = new Library("My books library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
