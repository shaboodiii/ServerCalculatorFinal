package com.calculatorServer.CalculatorServer.service;

import com.calculatorServer.CalculatorServer.model.Calculator;
import com.calculatorServer.CalculatorServer.model.Result;
import org.springframework.stereotype.Service;

@Service
public class ServerServiceImp implements ServerService{

    @Override
    public Result serverCalculate(Calculator calculator){
        Result result = new Result();
        double xValue = calculator.getxValue();
        double yValue = calculator.getyValue();
        String operator = calculator.getOperator();

        if(operator.equals("+")){

            result.setResult(xValue + yValue);

        } else if(operator.equals("-")){

            result.setResult(xValue - yValue);

        } else if(operator.equals("*")){

            result.setResult(xValue * yValue);

        } else if(operator.equals("/")){

            result.setResult(xValue / yValue);

        }

        return result;
    }
}
