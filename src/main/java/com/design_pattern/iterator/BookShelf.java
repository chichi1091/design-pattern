package com.design_pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate<Book> {
    private List<Book> books;

    public BookShelf(int maxIndex) {
        books = new ArrayList<Book>(maxIndex);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterater() {
        return new BookShelfIterator(this);
    }
}
