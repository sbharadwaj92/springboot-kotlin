package com.example.springbootkotlin

import com.example.springbootkotlin.domain.Person
import com.example.springbootkotlin.repo.PersonRepo
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootKotlinApplication(val personRepo: PersonRepo) : CommandLineRunner {

    override fun run(vararg args: String?) {
        personRepo.save(Person("sagar", "rout"))
        personRepo.save(Person("mohit", "singh"))
        personRepo.save(Person("rahul", "singh"))
        personRepo.save(Person("rajat", "sharma"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootKotlinApplication::class.java, *args)
}
