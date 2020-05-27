package com.serva4ok.Egator.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class ExerciseController {
    @GetMapping("/greetings")
    public String greeting(
            @RequestParam(name = "name",required = false, defaultValue = "world" )
            String name, Model model
    ){
        model.addAttribute("name",name);
        return "exercise";
    }

}
