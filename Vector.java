/**********************************************************
*Vector.java				Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Interfaz que contiene las operaciones que puede ejecutar
*la calculadora
*
*@author Andrea Amaya #19357
*@author Carlos 
**********************************************************/
public interface Vector implements iVector{
	private ArrayList<E> expresion = new ArrayList<E>();

	/**
	 * @param dato  Dato a agregar
	 */
	public void push(E dato){
		//post: Se agrega un dato al final del vector
		expresion.add(dato);
	}

	public E pop(){
		//pre: El tamaño del vector debe de ser mayor a cero
		//post: Se elimina el último dato agregado al vector
		if (size() > 0) {
			return expresion.remove(size()-1);
		} else {
			return -1;
		}
	}

	public E peek(){
		//pre: El tamaño del vector debe de ser mayor a cero
		//post: Se obtiene el último dato agregado a la lista
		if (size() > 0) {
			return expresion.get(size()-1);
		} else {
			return -1;
		}
	}

	public int size(){
		//post: Se obtiene el tamaño de la lista
		return expresion.size();
	}

	public boolean empty(){
		//post: Valor verdadero si la lista está vacía
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}