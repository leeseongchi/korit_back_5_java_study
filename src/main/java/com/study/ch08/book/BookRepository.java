package com.study.ch08.book;

public class BookRepository {

    final Book[] books;

    BookRepository(Book[] books) {
        this.books = books;
    }

    int getEmptyIndex() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Book book) {
        books[getEmptyIndex()] = book;
    }

    Book[] getBookDatas() {
        int bookCount = 0;
        for(int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                bookCount++;
            }
        }
        Book[] books1 = new Book[bookCount];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books1[j] = books[i];
                j++;
            }
        }
        return books1;
    }
}
