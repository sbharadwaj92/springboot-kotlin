package com.example.springbootkotlin.controller

import com.example.springbootkotlin.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(val personService: PersonService) { // constructor injection

    /**
     * Finds all persons from the database
     */
    @GetMapping("/")
    fun findAll() = personService.findAll()

    /**
     * Finds all persons from the database whose name matches with first name
     */
    @GetMapping("/findByFirstName/{firstName}")
    fun findByFirstName(@PathVariable("firstName") firstName: String) = personService.findByFirstName(firstName.toLowerCase())
}