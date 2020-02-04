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
	public void push(E dato);
	public E pop();
	public E peek();
	public boolean empty();
	public int size();
}