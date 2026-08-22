package com.bookstore.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.math.BigDecimal;

@Data
@TableName("book")
public class Book {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String bookName;
    private String author;
    private BigDecimal price;
    private String category;
    private String bookImg;
    private String bookDesc;
    private String press;
    private String publishDate;
}
