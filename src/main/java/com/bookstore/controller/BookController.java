package com.bookstore.controller;

import com.bookstore.common.Result;
import com.bookstore.entity.Book;
import com.bookstore.service.IBookService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Service
@RequestMapping("/book")
public class BookController {

    @Resource
    private IBookService bookService;

    @CrossOrigin
    @PostMapping("/getBookList")
    public Result<List<Book>> getBookList(){
        List<Book> list = bookService.getBookList();
        return Result.success(list);
    }
}
