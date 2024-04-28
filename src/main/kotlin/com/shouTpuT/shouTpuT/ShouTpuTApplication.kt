package com.shouTpuT.shouTpuT

import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
class ShouTpuTApplication {

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello $name!"
    }
}

fun main(args: Array<String>) {
	runApplication<ShouTpuTApplication>(*args)
}
