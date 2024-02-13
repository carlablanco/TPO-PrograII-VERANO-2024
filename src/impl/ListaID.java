package impl;

import api.ListaTDA;

public class ListaID implements ListaTDA {
	private Nodo inicio;
	private Nodo ultimo;

	@Override
	public void Inicializar() {
        inicio = null;
        ultimo = null;
	}

	@Override
	public void Agregar(int x) {
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.valor = x;
		nuevoNodo.siguiente = null;
		
		// Si la lista estaba vacia
		if (inicio == null) {
			ultimo = nuevoNodo;
			inicio = ultimo;
		}
		// Si la lista tenia items
		if (ultimo != null) {
			ultimo.siguiente = nuevoNodo;
			ultimo = nuevoNodo;
		}
	}

	
	@Override
	public void Eliminar(int x) {
		// Elimina solo la primera aparicion o todas?
		Nodo actual = inicio;
		
		if (actual.valor == x) {
			Eliminar();
		}
		else {
		
		while (actual.siguiente != null && actual.siguiente.valor != x) {
			actual = actual.siguiente;
		}
		if (actual.siguiente != null) {
			actual.siguiente = actual.siguiente.siguiente;
		}
		}
	}
	
	@Override
	public void Eliminar() {
		if (inicio != null) {
			inicio = inicio.siguiente;
		}
	}

	@Override
	public int Recuperar(int indice) {
		// TODO Auto-generated method stub
		Nodo actual = inicio;
		int count = 0;
		while (actual != null && count < indice) {
			actual = actual.siguiente;
			count++;
		}
		return actual.valor;
	}

	@Override
	public int Len() {
		int count = 0;
		Nodo actual = inicio;
		while (actual != null) {		
			count++;
			actual = actual.siguiente;
		}
		return count;
	}

	
	@Override
	public boolean Existe(int x) {
		// TODO Auto-generated method stub
		Nodo actual = inicio;
		
		while (actual != null) {
			if (actual.valor == x) {
				return true;
			} else {
				actual = actual.siguiente;
			}		
		}
		return false;
	}



}
