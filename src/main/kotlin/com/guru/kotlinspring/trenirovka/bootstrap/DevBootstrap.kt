package com.guru.kotlinspring.trenirovka.bootstrap

import com.guru.kotlinspring.trenirovka.Author
import com.guru.kotlinspring.trenirovka.Book
import com.guru.kotlinspring.trenirovka.repo.AuthorRepository
import com.guru.kotlinspring.trenirovka.repo.BookRepository
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class DevBootstrap(
        private val authorRepository: AuthorRepository,
        private val bookRepository: BookRepository
): ApplicationListener<ContextRefreshedEvent>{

    override fun onApplicationEvent(p0: ContextRefreshedEvent) {
        initData()
    }

    fun initData(){

        //Eric
        val eric =  Author("Eric" , "Evans")
        val ddd = Book("Domain Driven Design", "1234", "Harper Collins")
        eric.books.add(ddd)
        ddd.authors.add(eric)

        authorRepository.save(eric)
        bookRepository.save(ddd)

        //Rod
        val rod = Author("Rod", "Jonhon")
        val noEjb = Book("j2ee development", "23544", "work")
        rod.books.add(noEjb)

        bookRepository.save(noEjb)
    }
}