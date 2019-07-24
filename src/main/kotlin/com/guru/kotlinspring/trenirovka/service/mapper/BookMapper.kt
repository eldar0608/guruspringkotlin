package com.guru.kotlinspring.trenirovka.service.mapper

import com.guru.kotlinspring.trenirovka.model.Book
import com.guru.kotlinspring.trenirovka.service.dto.BookDto
import org.springframework.stereotype.Service

interface BookMapper{
    fun toBookDto(request: BookDto): Book
}

@Service
class DefaultBookMapper: BookMapper  {

    override fun toBookDto(request: BookDto): Book = Book(
            title = request.title,
            isbn = request.isbn,
            publisher = request.publisher,
            members = request.members
    )
}