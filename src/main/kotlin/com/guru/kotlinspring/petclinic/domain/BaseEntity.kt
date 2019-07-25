package com.guru.kotlinspring.petclinic.domain

import org.springframework.data.jpa.domain.support.AuditingEntityListener
import javax.persistence.*

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

//    @CreatedBy
//    @Column(name = "created_timestamp", updatable = false)
//    var createdTimestamp: LocalDateTime? = null
//
//    @LastModifiedDate
//    @Column(name = "modified_timestamp")
//    var modifiedTimestamp: LocalDateTime? = null

    val isPersisted: Boolean get() = id != null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BaseEntity

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result *= 31
        return result
    }

}