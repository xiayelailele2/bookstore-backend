package com.bookstore.service.impl;

import com.bookstore.entity.Book;
import com.bookstore.mapper.BookMapper;
import com.bookstore.service.IBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Service
public class BookServiceImpl implements IBookService {
    @Resource
    private BookMapper bookMapper;
    public List<Book> getBookList() {
        return bookMapper.getBookList();
    }
}
