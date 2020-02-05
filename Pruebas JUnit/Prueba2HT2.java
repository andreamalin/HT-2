import static org.junit.Assert.*;

import org.junit.Test;

public class Prueba2HT2 {

	@Test
	public void test() {
		Calculadora test2 = new Calculadora();
		iStack<Integer> stack = new Stack<Integer>(); 
		
		String[] operacion = { "1", "2", "*" };
		int numero, resultado=0, operando1, operando2; //Espacios para enteros
		
		for (int i=0; i<operacion.length; i++) {
			try {
				numero =Integer.parseInt(operacion[i]);
				stack.push(numero);
			} catch (Exception e){
				//Se jalan los dos últimos operandos del stack
				operando2 = stack.pop();
				operando1 = stack.pop();

				switch(operacion[i]){
					case "*":
						resultado = test2.multiplicar(operando2, operando1);
						break;
				}
				stack.push(resultado); 
			} 
		}
		
		int resFinal = stack.peek();
		assertEquals(2, resFinal);
	}
}
