package main;

import api.ListaTDA;
import impl.ListaID;

public class TPO {

	public static void main(String[] args) {
		ListaTDA lista = new ListaID();
        lista.Inicializar();
        lista.Agregar(24);
        lista.Agregar(80);
        lista.Agregar(45);
        System.out.println("este es el len de agregar"+lista.Len());
        
        lista.Eliminar(80);
        System.out.println("este es el len post eliminar"+lista.Len());
        
        System.out.println("recuperado"+lista.Recuperar(1));
        System.out.println("existe?"+lista.Existe(80));
        
	}
	
}
