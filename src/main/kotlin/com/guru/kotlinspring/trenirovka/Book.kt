package com.guru.kotlinspring.trenirovka

import com.guru.kotlinspring.domain.BaseEntity
import javax.persistence.*

@Entity
class Book(
        val title: String,

        val isbn: String,

        val publisher: String,

        @ManyToMany
        @JoinTable(
                name = "author_book",
                joinColumns = [JoinColumn(name = "book_id")],
                inverseJoinColumns = [JoinColumn(name = "author_id")]
        )
        val authors: MutableSet<Author> = mutableSetOf(),

//        @ElementCollection
//        @CollectionTable(name = "members", joinColumns = [JoinColumn(name = "member_id")])
//        @Column(name = "members")
//        val members: MutableList<String> = mutableListOf(),

        @ManyToMany
        @JoinTable(
                name = "custodian_group_custodian_member",
                joinColumns = [JoinColumn(name = "group_id")],
                inverseJoinColumns = [JoinColumn(name = "member_id")]
        )
        var members: List<Book> = listOf(),

        @ManyToMany(mappedBy = "members")
        var memberOf: List<Book> = listOf()

): BaseEntity()