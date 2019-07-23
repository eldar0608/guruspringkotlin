package com.guru.kotlinspring.trenirovka.service.controller

import com.guru.kotlinspring.trenirovka.Book
import com.guru.kotlinspring.trenirovka.service.dto.BookDto
import com.guru.kotlinspring.trenirovka.service.entity.BookService
import com.guru.kotlinspring.trenirovka.service.mapper.BookMapper
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/book")
class BookApiContoller(
        private val bookService: BookService,
        private val bookMapper: BookMapper
) {

    @PostMapping
    fun saveBook(@RequestBody book: BookDto): Book {
        val gaga =  bookMapper.toBookDto(book)
        return bookService.saveOrUpdate(gaga)
    }
}