package com.guru.kotlinspring.petclinic.service.entity

import com.guru.kotlinspring.petclinic.domain.entity.Pet

interface PetService {
    fun findById(id:Long): Pet
    fun save(pet: Pet): Pet
    fun findAll(): Set<Pet>
}

class DefaultPerService(): PetService{
    override fun findById(id: Long): Pet {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save(pet: Pet): Pet {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): Set<Pet> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}