package tp4;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class MaximoDosNumeros extends KeyAdapter{
	private JTextField campoDeTexto;
	public MaximoDosNumeros(JTextField campoDeTexto) {
		this.campoDeTexto = campoDeTexto;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		if(campoDeTexto.getText().length() > 1) {
			e.consume();
		}
		if (!Util.validarNumeros(e.getKeyChar())) {
			Util.alerta("Debe ser un dato numérico.");
			e.consume();
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		campoDeTexto.setBackground(Color.WHITE);
	}
}
