/**********************************************************
*Stack.java				Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Interfaz que contiene las operaciones que puede ejecutar
*la calculadora
*
*@author Andrea Amaya #19357
*@author Carlos Raxtum #19721
**********************************************************/
import java.util.ArrayList;

public class Stack<E> implements iStack<E>{
	protected ArrayList<E> expresion = new ArrayList<E>();
	
	public void push(E dato){
		
		expresion.add(dato);
	}

	public E pop(){

		if (size() > 0) {
			return expresion.remove(size()-1);
		} else {
			return null;
		}
	}

	public E peek(){

		if (size() > 0) {
			return expresion.get(size()-1);
		} else {
			return null;
		}
	}

	public int size(){

		return expresion.size();
	}

	public boolean empty(){

		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
