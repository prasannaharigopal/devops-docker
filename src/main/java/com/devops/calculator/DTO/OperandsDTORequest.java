package com.devops.calculator.DTO;

import lombok.Data;

@Data
public class OperandsDTORequest {
    private int a;
    private int b;
	public int getA() {
		// TODO Auto-generated method stub
		return this.a;
	}
	public int getB() {
		// TODO Auto-generated method stub
		return this.b;
	}

}
