package com.guru.kotlinspring.petclinic.service.entity

import com.guru.kotlinspring.petclinic.domain.entity.Vet

interface VetService {
    fun findById(id:Long): Vet
    fun save(vet: Vet): Vet
    fun findAll(): Set<Vet>
}

class DefaultVerService():VetService{
    override fun findById(id: Long): Vet {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save(vet: Vet): Vet {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): Set<Vet> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}