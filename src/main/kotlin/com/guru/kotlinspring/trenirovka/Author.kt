package com.guru.kotlinspring.trenirovka

import com.guru.kotlinspring.domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.ManyToMany

@Entity
class Author(
        val firstName: String,

        val lastName: String,

        @ManyToMany(mappedBy = "authors")
        val books: MutableSet<Book> = mutableSetOf()

): BaseEntity()