package com.guru.kotlinspring.trenirovka.dto

import com.guru.kotlinspring.trenirovka.model.Book
import com.guru.kotlinspring.trenirovka.model.Publisher

data class BookDto(
        val title: String,

        val isbn: String,

        val publisher: Publisher,

        var members: MutableList<Book> = mutableListOf()
)