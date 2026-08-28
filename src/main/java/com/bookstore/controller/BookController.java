package com.bookstore.controller;

import com.bookstore.common.Result;
import com.bookstore.entity.Book;
import com.bookstore.service.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookServiceImpl bookService;

    @PostMapping("/getBookList")
    public Result<List<Book>> getBookList(){
        List<Book> list = bookService.getBookList();
        return Result.success(list);
    }
}
