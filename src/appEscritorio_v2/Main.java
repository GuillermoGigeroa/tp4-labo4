package appEscritorio_v2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Ventana> listaVentanas = new ArrayList<Ventana>(4);
		listaVentanas.add(new VentanaPrincipal());
		listaVentanas.add(new VentanaEjercicio1());
		listaVentanas.add(new VentanaEjercicio2());
		listaVentanas.add(new VentanaEjercicio3());
	}
}
