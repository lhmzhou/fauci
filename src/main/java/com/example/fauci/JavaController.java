package com.example.fauci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {
	private static final String template = "Hello, %s!";

    @GetMapping("/java")
    public JavaGreeting javaGreeting(@RequestParam(value="name", defaultValue = "World") String name) {
        return new JavaGreeting(String.format(template, name));
    }
}
