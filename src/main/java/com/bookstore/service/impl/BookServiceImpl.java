package com.bookstore.service.impl;

import com.bookstore.entity.Book;
import com.bookstore.service.IBookService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBookService {
    public List<Book> getBookList() {
        List<Book> list = new ArrayList<>();

        Book b1 = new Book();
        b1.setId(1);
        b1.setBookName("西游记");
        b1.setAuthor("吴承恩2");
        b1.setPrice(new BigDecimal("45.5"));
        b1.setCategory("古典文学");
        list.add(b1);

        Book b2 = new Book();
        b2.setId(2);
        b2.setBookName("三国演义");
        b2.setAuthor("罗贯中");
        b2.setPrice(new BigDecimal("42.0"));
        b2.setCategory("古典文学");
        list.add(b2);

        Book b3 = new Book();
        b3.setId(3);
        b3.setBookName("Java编程思想");
        b3.setAuthor("Bruce Eckel");
        b3.setPrice(new BigDecimal("108"));
        b3.setCategory("计算机");
        list.add(b3);

        return list;
    }
}
