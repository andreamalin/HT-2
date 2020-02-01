/**********************************************************
*Calculadora.java			Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Lleva el control de las operaciones de la interfaz
*iCalculadora
*
*@author Andrea Amaya #19357
*@author Carlos 
**********************************************************/
public class Calculadora implements iCalculadora{
	/**
	 * @param operando1		Primer numero a sumar/restar/dividir/multiplicar
	 * @param operando2     Segundo numero a sumar/restar/dividir/multiplicar
	*/
	
	public int sumar(int operando1, int operando2){
		//pre: dos operandos
		//post: retorna la suma de dos enteros
		return operando1+operando2;
	}

	public int restar(int operando1, int operando2){
		//pre: dos operandos
		//post: retorna la resta de dos enteros
		return operando1-operando2;
	}

	public int dividir(int operando1, int operando2){
		//pre: dos operandos
		//post: retorna la división de dos enteros
		return operando1/operando2;
	}

	public int multiplicar(int operando1, int operando2){
		//pre: dos operandos
		//post: retorna la multiplicación de dos enteros
		return operando1*operando2;
	}
}