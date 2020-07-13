package com.calculatorServer.CalculatorServer.controller;

import com.calculatorServer.CalculatorServer.model.Calculator;
import com.calculatorServer.CalculatorServer.model.Result;
import com.calculatorServer.CalculatorServer.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ServerController {

    @Autowired
    private final ServerService serverService;

    public ServerController(ServerService serverService) {
        this.serverService = serverService;
    }

    @PostMapping(path = "/ServerCalculate", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Result serverCalculation(@RequestBody Calculator calculator){
        Result result = serverService.serverCalculate(calculator);
        return result;
    }
}
