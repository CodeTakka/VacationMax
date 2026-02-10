package com.firstdemo.myfirst;

import Service.Back;
import dto.VariablesBehind;
import dto.VariablesQuestion;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/vacation")
public class VacationController {

    private final Back service = new Back();

    @PostMapping
    public VariablesBehind evaluate (@RequestBody VariablesQuestion request){

        return service.evaluate(request);
    }
}


