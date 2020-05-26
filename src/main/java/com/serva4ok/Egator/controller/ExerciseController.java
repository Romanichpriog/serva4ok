package com.serva4ok.Egator.controller;


import com.serva4ok.Egator.exceptions.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping()
public class ExerciseController {
    public List<Map<String,String>> exercises = new ArrayList<Map<String, String>>(){{
        add(new HashMap<String, String>() {{put("id","1");put("text","zadanie1");}});
        add(new HashMap<String, String>() {{put("id","2");put("text","zadanie2");}});
        add(new HashMap<String, String>() {{put("id","3");put("text","zadanie3");}});
    }};
    @GetMapping
    public List<Map<String,String>> list(){
        return exercises;
    }
    @GetMapping("{id}")
    public Map<String,String> getOne(@PathVariable String id){
        return exercises.stream().filter(exercises-> exercises.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

}
