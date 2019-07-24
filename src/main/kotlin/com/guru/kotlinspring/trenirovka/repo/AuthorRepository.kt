package com.guru.kotlinspring.trenirovka.repo

import com.guru.kotlinspring.trenirovka.model.Author
import org.springframework.data.jpa.repository.JpaRepository


interface AuthorRepository: JpaRepository<Author, Long>