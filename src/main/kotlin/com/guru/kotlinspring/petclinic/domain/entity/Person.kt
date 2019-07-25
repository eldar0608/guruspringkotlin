package com.guru.kotlinspring.petclinic.domain.entity

import com.guru.kotlinspring.petclinic.domain.BaseEntity


open class Person(
        val fisrtName: String? = null,
        val lastName: String? = null
): BaseEntity()