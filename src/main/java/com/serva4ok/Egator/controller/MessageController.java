package com.serva4ok.Egator.controller;


import com.serva4ok.Egator.exception.NotFoundException;
import com.serva4ok.Egator.model.Exercise;
import com.serva4ok.Egator.represitory.ExerciseReprository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.*;

@RestController
@RequestMapping("message")

public class MessageController {
    @Autowired
    ExerciseReprository reprository;

    @RequestMapping("/save")
    public String process(){

        reprository.save(Arrays.asList(new Exercise("Укажите номера предложений, в которых верно передана ГЛАВНАЯ информация, содержащаяся в тексте. Запишите номера этих предложений.","Otvet1 \n Otvet2\n Otvet3 \n Otvet4 \n","24","(1)В некоторых моделях современных автомобилей раскрытие подушек безопасности при непристёгнутых ремнях автоматически блокируется. (2)<…> срабатывание подушек, происходящее с огромной скоростью, сродни сильному удару. (3)Если тело непристёгнутого человека в момент аварии не будет зафиксировано ремнём и сместится в сторону, подушка не только окажется плохим помощником, но и сама может стать причиной серьёзной травмы."), new Exercise("Самостоятельно подберите сочетание слов, которое должно быть на месте пропуска во втором предложении?","","деловтомчто","(1)В некоторых моделях современных автомобилей раскрытие подушек безопасности при непристёгнутых ремнях автоматически блокируется. (2)<…> срабатывание подушек, происходящее с огромной скоростью, сродни сильному удару. (3)Если тело непристёгнутого человека в момент аварии не будет зафиксировано ремнём и сместится в сторону, подушка не только окажется плохим помощником, но и сама может стать причиной серьёзной травмы."));
        return "Done";
    }

    @RequestMapping("/findall")
    public String findAll(){
        String result = "";

        for(Exercise cust : reprository.findAll()){
            result += cust.toString() + "<br>";
        }

        return result;
    }




}
