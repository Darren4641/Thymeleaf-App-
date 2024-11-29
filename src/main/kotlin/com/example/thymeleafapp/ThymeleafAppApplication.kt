package com.example.thymeleafapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class ThymeleafAppApplication

fun main(args: Array<String>) {
    runApplication<ThymeleafAppApplication>(*args)
}
