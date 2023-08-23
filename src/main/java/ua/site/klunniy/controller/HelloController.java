package ua.site.klunniy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping()
    public String sayHello() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @GetMapping("/goodbye")
    public String goodbye() {
        return "goodbye";
    }
}
