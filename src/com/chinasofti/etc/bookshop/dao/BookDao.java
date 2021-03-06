package com.chinasofti.etc.bookshop.dao;

import java.util.List;

import com.chinasofti.etc.bookshop.po.Book;

public interface BookDao {
	List<Book> findAllBooks();
	Book findBookByBookId(int bookId);
	int addBooks(Book book);
	int deleteBooks(int bookId);
	int modifyBooks(Book book,int bookId);
	List<String> findAuthorByBookName(String bookName);
	List<String> findBookNameByAuthor(String author);
}
