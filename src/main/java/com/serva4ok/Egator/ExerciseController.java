package com.serva4ok.Egator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ExerciseController {
    @GetMapping
    public String list(){
        return "index";
    }

}
