/**********************************************************
*driver.java			Fecha de creaciÃ³n: 01/01/2020
*							Ãšltima fecha de modificaciÃ³n: 
*							
*Main (lectura de texto y definir operando)
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;

public class driver {
	public static void mostrar(String direccion)throws FileNotFoundException, IOException{
		Stack<String> list = new Stack<String>();
		String a,b,valor;
		String CadTex;
	
		FileReader f = new FileReader(direccion);
			BufferedReader r = new BufferedReader(f);
			while((CadTex = r.readLine())!=null) {
				System.out.println(CadTex);	
				String[] Arraylist = CadTex.split(" ");
				for(int i = 0; i < CadTex.length(); i++){
					switch(Arraylist[i]) {
						case "+":
							a = list.pop();
					        b = list.pop();
					        valor = String.valueOf(Integer.valueOf(a)+Integer.valueOf(b));	
					        list.push(valor);
	                        break;
	                    case "-":
	                    	 a = list.pop();
						     b = list.pop();
						     valor = String.valueOf(Integer.valueOf(a)-Integer.valueOf(b));	
						     list.push(valor);
	                        break;
	                    case "*":
	                    	a = list.pop();
					        b = list.pop();
					        valor = String.valueOf(Integer.valueOf(a)*Integer.valueOf(b));	
					        list.push(valor);
	                        break;
	                    case "/":
	                    	 a = list.pop();
						     b = list.pop();
						     valor = String.valueOf(Integer.valueOf(a)/Integer.valueOf(b));	
						     list.push(valor);
	                        break;
	                    default:
	                    	list.push(Arraylist[i]);
	                        break;								
					}
				}
				list.push(CadTex);
			    System.out.println(list);
			}
			r.close();	
	}
	
	public static void main(String[] args) throws IOException{
		mostrar("C:\\Users\\craxt\\eclipse-workspace\\ProgramaHT2\\datos.txt");
	}
}
