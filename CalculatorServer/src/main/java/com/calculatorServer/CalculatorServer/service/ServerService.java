package com.calculatorServer.CalculatorServer.service;

import com.calculatorServer.CalculatorServer.model.Calculator;
import com.calculatorServer.CalculatorServer.model.Result;

public interface ServerService {

    public Result serverCalculate(Calculator calculator);
}
