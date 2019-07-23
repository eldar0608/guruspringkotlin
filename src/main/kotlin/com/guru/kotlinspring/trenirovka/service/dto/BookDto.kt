package com.guru.kotlinspring.trenirovka.service.dto

import com.guru.kotlinspring.trenirovka.Book

data class BookDto(
        val title: String,

        val isbn: String,

        val publisher: String,

        var members: MutableList<Book> = mutableListOf()
)