package com.guru.kotlinspring.trenirovka.controller.mvc

import com.guru.kotlinspring.trenirovka.repo.AuthorRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/mvc/author")
class AuthorMvcController(
        private val authorRepository: AuthorRepository
){

    @GetMapping
    fun getAuthors(model: Model): String{
        model.addAttribute("authors", authorRepository.findAll())
        return "authors"
    }
}