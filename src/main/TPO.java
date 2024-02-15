package main;

import api.ListaTDA;
import impl.ListaID;
import impl.Nodo;

public class TPO {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("\033[0;32m" + "=== TPO - Grupo 1  ===" + "\033[0m");
		System.out.println();
		
		ListaTDA lista = new ListaID();
        
		lista.Inicializar();
        
		lista.Agregar(24);
        lista.Agregar(80);
        lista.Agregar(45);
        lista.Agregar(6);
        lista.Agregar(12);
        lista.Agregar(6);
        lista.Agregar(57);
        lista.Agregar(65);
        lista.Agregar(15);
        lista.Agregar(63);
        lista.Agregar(4);
        lista.Agregar(405);
        lista.Agregar(63);
        
        System.out.println("\033[0;33m" + "La Lista Original es: " + "\033[0m");
        imprimirLista(lista);
        System.out.println("La cantidad de Elementos es: " +lista.Len());
        System.out.println();
        System.out.println("¿Existe el valor 65? "+lista.Existe(65));
        System.out.println("¿Existe el valor 405? "+lista.Existe(405));
        System.out.println();
        System.out.println("Recupero el valor correspondiente al indice 8: "+lista.Recuperar(8));
        System.out.println();
        System.out.println("* Eliminamos el 80, el 65 y el primero elemento (sin pasar parametro) *");
        lista.Eliminar(80);
        lista.Eliminar(65);
        lista.Eliminar();
        System.out.println();
        System.out.println("\033[0;33m" +"La Lista ahora es: " + "\033[0m");
        imprimirLista(lista);
        System.out.println("La cantidad de Elementos es: "+lista.Len());
        System.out.println();
        System.out.println("¿Luego de la eliminacion, existe el valor 65? "+lista.Existe(65));
        System.out.println("¿Luego de la eliminacion, existe el valor 405? "+lista.Existe(405));
        System.out.println();
        System.out.println("Recupero el nuevo valor correspondiente al indice 8: "+lista.Recuperar(8));
        System.out.println();
        System.out.println("* Elimino el 1098 que no existe *");
        System.out.println();
        lista.Eliminar(1098);
        System.out.println( "\033[0;33m" +"La Lista sigue siendo: " + "\033[0m");
        imprimirLista(lista);
        System.out.println("La cantidad de Elementos es: "+lista.Len());
		System.out.println();
		System.out.println("\033[0;32m" + "===== FIN =====" + "\033[0m");
		System.out.println();
        
        
	}
	
	public static void imprimirLista(ListaTDA lista1) {
		System.out.print("[ ");
		for (int i=0; i<lista1.Len(); i++) {
			System.out.print(lista1.Recuperar(i) + " ");
		}
				System.out.println("]");
	}
	

			
	

}
