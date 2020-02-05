/**********************************************************
*iStack.java				Fecha de creación: 01/01/2020
*							Última fecha de modificación: 
*							
*Lleva el control de las operaciones de la interfaz
*iStack
*
*@author Andrea Amaya #19357
*@author Carlos 
**********************************************************/
public interface iStack<E>{

	/**
	 * @param dato  Dato a agregar
	 */
	public void push(E dato);
		//post: Se agrega un dato al final del vector

	public E pop();
		//pre: El tamaño del vector debe de ser mayor a cero
		//post: Se elimina el último dato agregado al vector

	public E peek();
		//pre: El tamaño del vector debe de ser mayor a cero
		//post: Se obtiene el último dato agregado a la lista

	public boolean empty();
		//post: Valor verdadero si la lista está vacía

	public int size();
		//post: Se obtiene el tamaño de la lista
}