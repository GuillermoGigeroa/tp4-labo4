package appEscritorio_v3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

public class VentanaEjercicio3 extends JFrame implements Ventana{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public VentanaEjercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(posX, posY, ancho, alto);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	@Override
	public void hacerVisible() {
			this.setVisible(true);
	}
}
