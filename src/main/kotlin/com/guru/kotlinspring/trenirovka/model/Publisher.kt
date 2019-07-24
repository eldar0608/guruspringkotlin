package com.guru.kotlinspring.trenirovka.model

import com.guru.kotlinspring.domain.BaseEntity
import javax.persistence.Entity

@Entity
class Publisher(
        var name: String? = null,
        val address: String? = null
): BaseEntity()