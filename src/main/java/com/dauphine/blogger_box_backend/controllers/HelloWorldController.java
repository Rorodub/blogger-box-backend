package com.dauphine.blogger_box_backend.controllers;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;


@RestController
@Tag(
        name = "Hello world API",
        description = "My first hello world endpoints"
)
public class HelloWorldController {

    @GetMapping("hello-world")
    public String helloWorld() {

        return "Hello World!";
    }

    @GetMapping("hello")
    public String HelloByName (@RequestParam String name) {

        return "Hello " + name;
    }

    @GetMapping("hello/{name}")
    @Operation(
            summary = "Hello by name endpoint",
            description =  "Returns 'Hello{Name}' by path variable"
    )
    public String hello(
            @Parameter(description = "Name to greet")
            @PathVariable String name
    ) {
        return "Hello " + name;
    }
}
