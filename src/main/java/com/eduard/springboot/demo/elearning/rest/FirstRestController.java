package com.eduard.springboot.demo.elearning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
    public FirstRestController() {

    }

    @GetMapping("/")
    public String sayHello () {
        return "Hello World";
    }

    //Expose a new REST endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    //Expose a new REST endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Bad luck today";
    }



}
