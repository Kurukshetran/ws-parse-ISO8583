package com.gs.bcocencosud

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * https://spring.io/guides/gs/rest-service/
 */
@RestController
class GreetingController {

    // http://localhost:8080/greeting?name=Edgar
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World")String name) {
        return "Hello, ${name}!"
    }
}