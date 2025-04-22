package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloWorldController {


    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle";
    }


    @GetMapping("/HelloWorld2/{name}")
    public String saluda2(@PathVariable(required = false) String name) {
        if (name == null) {
            return "Hola, Estás ejecutando un proyecto Gradle";
        }
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle";
    }
}
