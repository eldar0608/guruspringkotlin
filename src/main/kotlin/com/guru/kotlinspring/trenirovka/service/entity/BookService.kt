package com.guru.kotlinspring.trenirovka.service.entity

import com.guru.kotlinspring.trenirovka.Book
import com.guru.kotlinspring.trenirovka.repo.BookRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

interface BookService{
    fun saveOrUpdate(book: Book): Book
}

@Service
class DefaultBookService(
        private val bookRepository: BookRepository
): BookService{

    @Transactional
    override fun saveOrUpdate(book: Book): Book {
        return bookRepository.save(book)
    }
}