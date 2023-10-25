package com.weCode.bookstore.controller;

import com.weCode.bookstore.records.BookRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/vi")
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<BookRecord>> getBooks() {
        BookRecord bookRecord = new BookRecord("My First Books");

        List<BookRecord> books = new ArrayList<>();

        books.add(bookRecord);
        return ResponseEntity.ok(books);

    }
}