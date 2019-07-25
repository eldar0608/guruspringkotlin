package com.guru.kotlinspring.petclinic.domain.entity

import java.time.LocalDateTime

class Pet (
        val petType: PetType,
        val owner: Owner,
        val birthDate: LocalDateTime
)

class PetType(
        val name: String
)