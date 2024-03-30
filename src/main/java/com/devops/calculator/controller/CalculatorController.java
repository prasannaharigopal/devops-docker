package com.devops.calculator.controller;

import com.devops.calculator.DTO.OperandsDTORequest;
import com.devops.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("math/")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/addition")
    public ResponseEntity<String> addition(@RequestBody OperandsDTORequest operandsDTORequest){
            return  ResponseEntity.ok("Addition of  A and B is "+calculatorService.additionOfNumbers(operandsDTORequest));

    }

    @PostMapping("/subtraction")
    public ResponseEntity<String> subtraction(@RequestBody OperandsDTORequest operandsDTORequest){
        return ResponseEntity.ok("Subtraction of A and B is "+calculatorService.subtractionOfNumbers(operandsDTORequest));
    }

    @PostMapping("/multiplication")
    public ResponseEntity<String> multiplication(@RequestBody OperandsDTORequest operandsDTORequest){
        return ResponseEntity.ok("Multiplication of A and B is "+ calculatorService.multiplicationOfNumbers(operandsDTORequest));
    }


}
