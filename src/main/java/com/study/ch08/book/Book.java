package com.study.ch08.book;

public class Book {

    String name;
    String kind;

    Book () {

    }

    Book(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                '}';
    }
}
