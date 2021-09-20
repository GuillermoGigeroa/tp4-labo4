package appEscritorio_v1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventoMouse extends MouseAdapter{
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Click en el boton.");
	}
}
