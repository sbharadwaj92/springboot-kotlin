package com.example.springbootkotlin.service

import com.example.springbootkotlin.domain.Person
import com.example.springbootkotlin.repo.PersonRepo
import org.springframework.stereotype.Service

interface PersonService {

    fun findAll(): List<Person>
    fun findByFirstName(firstName: String): List<Person>
}

@Service
class PersonServiceImpl(val personRepo: PersonRepo) : PersonService {

    override fun findAll(): List<Person> {
        return personRepo.findAll()
    }

    override fun findByFirstName(firstName: String): List<Person> {
        return personRepo.findByFirstName(firstName)
    }
}