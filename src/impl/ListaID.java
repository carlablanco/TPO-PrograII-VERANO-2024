package impl;

import apis.ListaTDA;

public class Lista implements ListaTDA {
	
	Nodo inicio;
	Nodo fin;
	
	public void inicializarLista() {
		inicio = null;
		fin = null;
	}

	public void agregar (int elemento) {
		
		Nodo nuevoDato = new Nodo();
		nuevoDato.info = elemento;
		nuevoDato.siguiente = null;
		
		if (inicio == null && fin == null) {
			inicio = nuevoDato;
			fin = nuevoDato;
		
		}
		else { 	
				fin.siguiente = nuevoDato;
				fin = nuevoDato;
			
		}
	}

	public void eliminar() {
		if (inicio != null) {
			inicio = inicio.siguiente;
			
		}
	}

	public void eliminar(int elemento) {
		Nodo nodoActual = new Nodo();
		nodoActual = inicio;
		if (nodoActual.info == elemento && inicio.info == elemento) {
			eliminar();
		} else {
			while(nodoActual != null && nodoActual.siguiente.info != elemento) {
				nodoActual = nodoActual.siguiente; // con esto encuentro el nodo 
			}
			nodoActual.siguiente =nodoActual.siguiente.siguiente;
			
		}
	}

	public int recuperar(int indice) { // paso a void
		// tengo que recuperar el aux.info;
		// es throw es lo mismo que el raise en python que vimos en progra 1.
		try {
			
			if (indice < 0 || indice > len() ) {
				throw new IndexOutOfBoundsException ("No podes ingresar un valor fuera de rango");
				
			}
			int indices = 0;
			Nodo auxiliar = new Nodo();
			auxiliar = inicio;
			while(auxiliar != null && indices < indice) {
				auxiliar = auxiliar.siguiente;
				indices ++;
				
			}
			return auxiliar.info;
			
		} catch(IndexOutOfBoundsException e) {
			System.out.print(e.getMessage());
			return -1;
			
		}
	}
//		 if (indice < 0 || indice > len()) {
//			 throw new IndexOutOfBoundsException("No podes ingresar un valor fuera largo"); 
//		 }
//		 try)
//		 int indices = 0;
//		 Nodo auxiliar = new Nodo();
//		 auxiliar = inicio;
//		 
//		 while(auxiliar != null && indices < indice) {
//			 auxiliar = auxiliar.siguiente;
//			 indices ++;
//		 }
//		 return auxiliar.info; // esto tiene que devolver.
//		 
	public boolean existe(int elemento) {
		boolean existe = true;
		Nodo auxiliar = new Nodo();
		auxiliar = inicio;
		if (auxiliar == null && auxiliar.info != elemento) {
			existe = false;
			
		} else {
			while(auxiliar.info != elemento) {
				auxiliar = auxiliar.siguiente;
			}
		}
		return existe;
	}
	
	public int len() {
		int largo = 0 ;
		Nodo auxiliar = new Nodo();
		auxiliar = inicio;
		
		while(auxiliar != null) {
			auxiliar = auxiliar.siguiente;
			largo ++;
		}
		return largo;
	}

	
	public void mostrarLista() {
		Nodo auxiliar= new Nodo();
		auxiliar = inicio;
		
		if (auxiliar == null) {
			System.out.println("La lista se encuentra vacia");
		}
		else {
			System.out.print("[ ");
			while(auxiliar != null) {
				System.out.print(auxiliar.info+" ");
				auxiliar = auxiliar.siguiente;
			}
			System.out.print("]");
			System.out.println(" ");
		}
		
	}

}

