package cn.johnyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @RequestMapping("/books")
    public String findAllBooks(){
        return "查询所有的图书";
    }

    @RequestMapping("/add")
    public String addBook(){
        return "添加！";
    }

//    @RequestMapping("/error")
//    public String error(){
//        return "没有登录或权限不足";
//    }
}
