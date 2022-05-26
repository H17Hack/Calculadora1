package com.esau;

public class Calculadora {
	

	private int num1;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public char getOperador() {
		return operador;
	}
	public void setOperador(char operador) {
		this.operador = operador;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	private int num2;
	private char operador;
	private float resultado;
	
	public void Calcular()
	{
		switch	(operador) {
		case '+':
			resultado = num1 + num2;
		break;		
		
		case '-':
			resultado = num1 - num2;
		break;
		
		case '*':
			resultado = num1 * num2;
		break;
		
		case '/':
			float n1= num1;
			float n2= num2;
			resultado = n1 / n2;
		break;
		}
	}
}
