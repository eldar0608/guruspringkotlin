package com.guru.kotlinspring.trenirovka.repo

import com.guru.kotlinspring.trenirovka.model.Publisher
import org.springframework.data.jpa.repository.JpaRepository

interface PublisherRepository: JpaRepository<Publisher, Long>