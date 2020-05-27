package com.serva4ok.Egator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ExerciseController {
    @GetMapping("/greetings")
    public String greeting(
            @RequestParam(name = "name",required = false, defaultValue = "world" )
            String name, Map<String,Object> model
    ){
        model.put("name",name);
        return "exercise";
    }

}
