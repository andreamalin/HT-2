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
		try {
			Scanner r = new Scanner(new File("datos.txt")); 
			while (r.hasNextLine()) {
				txt += (r.nextLine()); //Mientras hayan lineas por leer se meten a la variable txt
			}
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
		}
		
		operacion = txt.split(" "); //Operacion creada a partir del txt
		

		//Se opera
		for(int i = 0; i < operacion.length; i++){
			try {
				valor =Integer.parseInt(operacion[i]);
				stack.push(valor); //Si es entero se agrega

			} catch (Exception e){
				//No hay suficientes operandos
				if (stack.size() >= 2) {
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
				} else {
					System.out.println("_______________________________________\n         NO HAY SUFICIENTES DATOS \n_______________________________________");
				}
			}
		}
			
		//Se muestra
		System.out.println("_______________________________________\n          EL RESULTADO ES: " + stack.peek() + "\n_______________________________________");
	}
}