package com.devops.calculator.service;

import com.devops.calculator.DTO.OperandsDTORequest;

public interface CalculatorService {
    int additionOfNumbers(OperandsDTORequest operandsDTORequest);

    int subtractionOfNumbers(OperandsDTORequest operandsDTORequest);

    int multiplicationOfNumbers(OperandsDTORequest operandsDTORequest);
}
