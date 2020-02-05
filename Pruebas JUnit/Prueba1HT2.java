import static org.junit.Assert.*;

import org.junit.Test;

public class Pruba1HT2 {

	@Test
	public void test() {
		Calculadora test1 = new Calculadora();
		
		int operando1 = 10;
		int operando2 = 15;
		
		int resultado = test1.sumar(operando2, operando1); 
		
		assertEquals(25, resultado);
	}
}
