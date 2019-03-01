package com.design_pattern.iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("test1"));
        bookShelf.appendBook(new Book("test2"));
        bookShelf.appendBook(new Book("test3"));
        bookShelf.appendBook(new Book("test4"));

        Iterator<Book> it = bookShelf.iterater();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
    }
}
