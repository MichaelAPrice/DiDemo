package guru.springframework.controllers;

import guru.springframework.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;


    @Autowired
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService =greetingService;


    }

    public String sayGreetings(){
        return greetingService.sayGreeting();
    }
}
