package com.guru.kotlinspring.trenirovka.service.entity

import com.guru.kotlinspring.trenirovka.model.Book
import com.guru.kotlinspring.trenirovka.repo.BookRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

interface BookService{
    fun saveOrUpdate(book: Book): Book
    fun findAllBook(): MutableList<Book>
    fun saveMembers()
}

@Service
class DefaultBookService(
        private val bookRepository: BookRepository
): BookService{

    override fun saveMembers() {

    }

    @Transactional
    override fun saveOrUpdate(book: Book): Book {
        return bookRepository.save(book)
    }

    @Transactional
    override fun findAllBook(): MutableList<Book> {
        return bookRepository.findAll()
    }


}