package appEscritorio_v2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdministradorDeEventos implements ActionListener {
	private String comando;
	private ArrayList<Ventana> listaVentanas;

	// Constructores
	public AdministradorDeEventos() {
		this.comando = "aviso";
	}

	public AdministradorDeEventos(String comando) {
		this.comando = comando.trim().toLowerCase();
	}

	// Metodos
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (comando) {
		case "aviso":
			
			break;
		default:
			break;
		}
		if (comando == "aviso") {
			System.out.println("Se presionó el botón.");
		}
		if (comando == "e1") {
			//Codigo para ejecutar ventana del ejercicio 1
			listaVentanas.get(1).hacerVisible();
		}
		if (comando == "mostrar") {
			System.out.println("Usuario toco mostrar.");
		}
		if (comando == "e2") {
			//Codigo para ejecutar ventana del ejercicio 2
			listaVentanas.get(2).hacerVisible();
		}
		if (comando == "e3") {
			//Codigo para ejecutar ventana del ejercicio 3
			listaVentanas.get(3).hacerVisible();
		}
	}
	protected String getComando() {
		return comando;
	}
	protected void setComando(String comando) {
		comando = comando.trim().toLowerCase();
	}
	protected void recibirLista(ArrayList<Ventana> listaVentanas) {
		this.listaVentanas = listaVentanas;
	}
}
