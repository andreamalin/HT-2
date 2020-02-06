/**********************************************************
*driver.java				Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Lleva el control de las operaciones a ejectur
*Importa el paquete java.util
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
import java.util.Scanner; //Para leer txt
import java.io.IOException; //Exepción
import java.io.FileNotFoundException; //Exepción
import java.io.File; //Archivos

public class driver {
	public static void main(String[] args) throws IOException{
		String txt = ""; //La operación se meterá a esta variable
		String[] operacion; //Operacion a leer
		int valor=0, operando1, operando2; //Espacios para enteros

		//Instancias
		iCalculadora calculadora = new Calculadora();
		iStack<Integer> stack = new Stack<Integer>(); 

		//Se lee el txt
		Scanner r = new Scanner(new File("datos.txt"));
		while( r.hasNextLine()) {
			txt += r.nextLine();
		}
		operacion = txt.split(" "); //Operacion creada a partir del txt
		r.close();	

		//Se opera
		for(int i = 0; i < operacion.length; i++){
			try {
				valor =Integer.parseInt(operacion[i]);
				stack.push(valor); //Si es entero se agrega

			} catch (Exception e){
				//Se jalan los dos últimos operandos del stack
				operando2 = stack.pop();
				operando1 = stack.pop();
				
				//Se busca el operador
				switch(operacion[i]) {
					case "+":
				        valor = calculadora.sumar(operando2, operando1);
                        break;
					case "-":
						valor = calculadora.restar(operando2, operando1);
						break;
					case "*":
						valor = calculadora.multiplicar(operando2, operando1);
						break;
					case "/":
						valor =  calculadora.dividir(operando2, operando1);
						break;
					default:
						System.out.println("Error");
						break;								
				}
				stack.push(valor);
			}
		}
			
		//Se muestra
		System.out.println("_______________________________________\n          EL RESULTADO ES: " + stack.peek() + "\n_______________________________________");
	}
}