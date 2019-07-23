package com.guru.kotlinspring.trenirovka.repo

import com.guru.kotlinspring.trenirovka.Book
import org.springframework.data.jpa.repository.JpaRepository


interface BookRepository: JpaRepository<Book, Long>