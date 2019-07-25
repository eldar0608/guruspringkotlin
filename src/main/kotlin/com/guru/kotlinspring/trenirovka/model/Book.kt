package com.guru.kotlinspring.trenirovka.model

import com.guru.kotlinspring.petclinic.domain.BaseEntity
import javax.persistence.*

@Entity
class Book(
        val title: String,

        val isbn: String,

        @OneToOne
        val publisher: Publisher,

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

        @ManyToMany(cascade = [CascadeType.ALL])
        @JoinTable(
                name = "custodian_group_custodian_member",
                joinColumns = [JoinColumn(name = "group_id")],
                inverseJoinColumns = [JoinColumn(name = "member_id")]
        )
        var members: MutableList<Book> = mutableListOf(),

        @ManyToMany(mappedBy = "members")
        var memberOf: MutableList<Book> = mutableListOf()

): BaseEntity()