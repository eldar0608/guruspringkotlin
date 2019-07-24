package com.guru.kotlinspring.trenirovka.controller

import com.guru.kotlinspring.trenirovka.repo.BookRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/mvc/book")
class BookMvcController(
        private val bookRepository: BookRepository
){

    @GetMapping("/books")
    fun getBooks(model: Model): String{
        model.addAttribute("books", bookRepository.findAll())
        return "books"
    }
}