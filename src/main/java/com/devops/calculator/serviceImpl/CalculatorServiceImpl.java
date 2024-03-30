package com.devops.calculator.serviceImpl;

import com.devops.calculator.DTO.OperandsDTORequest;
import com.devops.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int additionOfNumbers(OperandsDTORequest operandsDTORequest) {
        return operandsDTORequest.getA()+ operandsDTORequest.getB();
    }

    @Override
    public int subtractionOfNumbers(OperandsDTORequest operandsDTORequest) {
        if(operandsDTORequest.getA() > operandsDTORequest.getA()){
            return operandsDTORequest.getA() - operandsDTORequest.getB();
        }
        else{
            return operandsDTORequest.getB() - operandsDTORequest.getA();
        }
    }

    @Override
    public int multiplicationOfNumbers(OperandsDTORequest operandsDTORequest) {
        return operandsDTORequest.getA() * operandsDTORequest.getB();
    }
}
