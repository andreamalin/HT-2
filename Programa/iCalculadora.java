/**********************************************************
*iCalculadora.java			Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Interfaz que contiene las operaciones que puede ejecutar
*la calculadora
*
*@author Andrea Amaya #19357
*@author Carlos 
**********************************************************/
public interface iCalculadora{

	
	public int sumar(int operando2, int operando1);
		//pre: dos operandos
		/**
		 * @param operando2		Primer numero a sumar
		 * @param operando1     Segundo numero a sumar
		 * @return entero 		La suma de dos enteros
		 */

	public int restar(int operando2, int operando1);
		//pre: dos operandos
		/**
		 * @param operando2		Primer numero a restar
		 * @param operando1     Segundo numero a restar
		 * @return entero 		La resta de dos enteros
		 */
	
	public int dividir(int operando2, int operando1);
		//pre: dos operandos
		/**
		 * @param operando2		Primer numero a dividir
		 * @param operando1     Segundo numero a dividir
		 * @return entero 		La division de dos enteros
		 */

	public int multiplicar(int operando2, int operando1);
		//pre: dos operandos
		/**
		 * @param operando2		Primer numero a multiplicar
		 * @param operando1     Segundo numero a multiplicar
		 * @return entero 		La multiplicacion de dos enteros
		 */
}