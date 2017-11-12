package com.example.springbootkotlin.repo

import com.example.springbootkotlin.domain.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepo : JpaRepository<Person, Long> {

    fun findByFirstName(firstName: String): List<Person>
}