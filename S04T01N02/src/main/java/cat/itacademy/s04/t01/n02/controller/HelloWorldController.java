package cat.itacademy.s04.t01.n02.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {


    @GetMapping("/HelloWorld")
    public String sayHello(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle";
    }


    @GetMapping("/HelloWorld2/{name}")
    public String sayHello2(@PathVariable(required = false) String name) {
        if (name == null) {
            return "Hola, Estás ejecutando un proyecto Gradle";
        }
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle";
    }
}
