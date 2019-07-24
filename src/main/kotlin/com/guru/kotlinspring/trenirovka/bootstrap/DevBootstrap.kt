package com.guru.kotlinspring.trenirovka.bootstrap

import com.guru.kotlinspring.trenirovka.model.Author
import com.guru.kotlinspring.trenirovka.model.Book
import com.guru.kotlinspring.trenirovka.model.Publisher
import com.guru.kotlinspring.trenirovka.repo.AuthorRepository
import com.guru.kotlinspring.trenirovka.repo.BookRepository
import com.guru.kotlinspring.trenirovka.repo.PublisherRepository
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component

@Component
class DevBootstrap(
        private val authorRepository: AuthorRepository,
        private val bookRepository: BookRepository,
        private val publisherRepository: PublisherRepository
): ApplicationListener<ContextRefreshedEvent>{

    override fun onApplicationEvent(p0: ContextRefreshedEvent) {
        initData()
    }

    fun initData(){

        val publisher = Publisher()
        publisher.name = "fooo"

        publisherRepository.save(publisher)

        //Eric
        val eric = Author("Eric", "Evans")
        val ddd = Book("Domain Driven Design", "1234", publisher)
        eric.books.add(ddd)
        ddd.authors.add(eric)

        authorRepository.save(eric)
        bookRepository.save(ddd)

        //Rod
        val rod = Author("Rod", "Jonhon")
        val noEjb = Book("j2ee development", "23544", publisher)
        rod.books.add(noEjb)

        authorRepository.save(rod)
        bookRepository.save(noEjb)
    }
}