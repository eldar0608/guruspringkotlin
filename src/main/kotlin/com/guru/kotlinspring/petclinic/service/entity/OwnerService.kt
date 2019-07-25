package com.guru.kotlinspring.petclinic.service.entity

import com.guru.kotlinspring.petclinic.domain.entity.Owner

interface OwnerService {
    fun findById(id: Long): Owner
    fun findByLastName(lastName: String): Owner
    fun save(owner: Owner): Owner
    fun findAll(): Set<Owner>
}


class DefaultOwnerService(

): OwnerService{
    override fun findById(id: Long): Owner {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findByLastName(lastName: String): Owner {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save(owner: Owner): Owner {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(): Set<Owner> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}