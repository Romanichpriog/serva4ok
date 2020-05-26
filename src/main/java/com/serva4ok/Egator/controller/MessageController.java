package com.serva4ok.Egator.controller;


import com.serva4ok.Egator.exception.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("message")

public class MessageController {
    private int counter = 4;
    private List<Map<String, String>> message = new ArrayList<Map<String, String>>(){{
        add(new HashMap<String, String>() {{put("id","1"); put("text","first message");}});
        add(new HashMap<String, String>() {{put("id","2"); put("text","second message");}});
        add(new HashMap<String, String>() {{put("id","3"); put("text","third message");}});


    }};
    @GetMapping
    public List<Map<String, String>> list(){
        return message;
    }
    @GetMapping("{id}")
    public Map<String,String> getOne(@PathVariable String id){
        return getMessage(id);
    }

    private Map<String, String> getMessage(@PathVariable String id) {
        return message.stream()
                .filter(message -> message.get("id").equals(id))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    @PostMapping
    public Map<String,String> create(@RequestBody Map<String,String> messag){
        messag.put("id",String.valueOf(counter++));
        message.add(messag);
        return messag;
    }
    @PutMapping("{id}")
    public Map<String,String> update(@PathVariable String id, @RequestBody Map<String,String> messag){
        Map<String,String> massegeFromDB = getMessage(id);
        massegeFromDB.putAll(messag);
        massegeFromDB.put("id",id);
        return massegeFromDB;
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id){
        Map<String,String> messag = getMessage(id);
        message.remove(messag);
    }


}
