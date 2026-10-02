package com.bookstore.common;

import com.bookstore.entity.Book;
import lombok.Data;

import java.util.List;

@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMsg("查询成功");
        result.setData(data);
        return result;
    }

    //业务失败，自定义提示
    public static <T> Result<T> error(String msg){
        Result<T> result = new Result<>();
        result.setCode(500);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
