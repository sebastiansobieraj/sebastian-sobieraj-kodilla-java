package com.kodilla.testing.com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        if (titleFragment.length() < 3) return new ArrayList<>();
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return new ArrayList<>();
        return resultList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        if (libraryDatabase.listBooksInHandsOf(libraryUser).size() <= 0){
            return new ArrayList<>();
        }
        List<Book> userBookList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if(userBookList.size() > 0) {
        }
        return userBookList;
    }
}
