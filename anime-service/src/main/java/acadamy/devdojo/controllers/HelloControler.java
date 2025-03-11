package acadamy.devdojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {


    @GetMapping("hi")
    public String hi(){
        return "Hello World!";
    }



}
