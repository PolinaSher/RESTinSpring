package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

//MVC and RESTful web service controllers are different. https://spring.io/guides/gs/rest-service/
//HTTP request are handled by a controller

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final AtomicInteger ii = new AtomicInteger(8);
//The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method
    // @PostMapping for POST
    //@RequestMapping annotation that they all derive from, and can serve as a synonym (e.g. @RequestMapping(method=GET)

    @GetMapping("/greeting")
    //@RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method. If the name parameter is absent in the request, the defaultValue of World is used.
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        //handle GET requesy for /greeting by returning a new instance of the Greeting class
        return new Greeting(counter.incrementAndGet(), String.format(template, name), ii.intValue());
    }
}
