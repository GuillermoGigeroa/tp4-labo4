package appEscritorio_v3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministradorDeEventos implements ActionListener {
	private int numeroVentana;
	public AdministradorDeEventos(int numeroVentana) {
		this.numeroVentana = numeroVentana;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (numeroVentana) {
		case 0:
			(new VentanaEjercicio1()).hacerVisible();
			break;
		case 1:
			(new VentanaEjercicio2()).hacerVisible();
			break;
		case 2:
			(new VentanaEjercicio3()).hacerVisible();
			break;
		case 3:
			System.out.println("Apretaste mostrar.");
			break;
		default:
			System.out.println("Hiciste lio.");
			break;
		}
	}
}
