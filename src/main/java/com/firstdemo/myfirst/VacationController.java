package com.firstdemo.myfirst;

import dto.VariablesBehind;
import dto.VariablesQuestion;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vacation")
public class VacationController {

    private final Back service;

    // Spring injects the service
    public VacationController(Back service) {
        this.service = service;
    }

    // ✅ GET endpoint → works in browser
    @GetMapping
    public String status() {
        return "Vacation API is running";
    }

    // ✅ POST endpoint → main logic
    @PostMapping
    public VariablesBehind evaluate(@RequestBody VariablesQuestion request) {
        return service.evaluate(request);
    }
}



