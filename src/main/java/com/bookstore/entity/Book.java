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
    private Integer id;//主键ID
    private String bookName;//图书名称
    private String author;//图书作者
    private BigDecimal price;//图书价格
    private String category;//图书分类
    private String bookImg;//图书封面
    private String bookDesc;//图书简介
    private String press;//出版社
    private String publishDate;//出版日期
}
