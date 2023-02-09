package com.sandlex.runcalcweb.controllers;

import com.sandlex.runcalc.Calculator;
import com.sandlex.runcalc.InvalidPaceBlockException;
import com.sandlex.runcalc.InvalidSchemaException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuncalcController {

    @GetMapping("/wakeup")
    public String status() {
        return "Ready to roll";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam String paceBlock, @RequestParam String schema) {
        try {
            return Calculator.getEstimation(paceBlock, schema).toString();
        } catch (InvalidPaceBlockException e) {
            throw new RuntimeException(e);
        } catch (InvalidSchemaException e) {
            throw new RuntimeException(e);
        }
    }

}
