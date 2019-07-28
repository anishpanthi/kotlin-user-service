package com.app.kotlin.user.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

/**
 * @author Anish Panthi
 */
@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.app.kotlin.user.*"))
class KotlinUserServiceApplication

fun main(args: Array<String>) {
    runApplication<KotlinUserServiceApplication>(*args)
}
