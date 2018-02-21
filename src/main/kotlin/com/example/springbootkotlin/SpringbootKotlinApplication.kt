package com.example.springbootkotlin

import com.example.springbootkotlin.domain.Person
import com.example.springbootkotlin.repo.PersonRepo
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.support.SpringBootServletInitializer
import org.springframework.boot.builder.SpringApplicationBuilder


@SpringBootApplication
class SpringbootKotlinApplication : SpringBootServletInitializer() {

    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(SpringbootKotlinApplication::class.java)
    }

    companion object {

        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SpringbootKotlinApplication::class.java, *args)
        }
    }

}