package appEscritorio_v2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;

public class VentanaPrincipal extends JFrame implements Ventana {

	private static final long serialVersionUID = 1L;
	private JPanel panel1;
	public VentanaPrincipal() {
		setTitle("Grupo 3 - TP 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(posX, posY, ancho, alto);
		panel1 = new JPanel();
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel1);
		GridBagLayout gbl_panel1 = new GridBagLayout();
		gbl_panel1.columnWidths = new int[]{394, 0};
		gbl_panel1.rowHeights = new int[]{20, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel1.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel1.setLayout(gbl_panel1);
		
		JLabel lblGrupo = new JLabel("GRUPO NRO: 3");
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblGrupo = new GridBagConstraints();
		gbc_lblGrupo.insets = new Insets(0, 0, 5, 0);
		gbc_lblGrupo.anchor = GridBagConstraints.NORTH;
		gbc_lblGrupo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGrupo.gridx = 0;
		gbc_lblGrupo.gridy = 1;
		panel1.add(lblGrupo, gbc_lblGrupo);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new AdministradorDeEventos("e1"));
		GridBagConstraints gbc_btnEjercicio1 = new GridBagConstraints();
		gbc_btnEjercicio1.insets = new Insets(0, 0, 5, 0);
		gbc_btnEjercicio1.gridx = 0;
		gbc_btnEjercicio1.gridy = 3;
		panel1.add(btnEjercicio1, gbc_btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new AdministradorDeEventos("e2"));
		GridBagConstraints gbc_btnEjercicio2 = new GridBagConstraints();
		gbc_btnEjercicio2.insets = new Insets(0, 0, 5, 0);
		gbc_btnEjercicio2.gridx = 0;
		gbc_btnEjercicio2.gridy = 4;
		panel1.add(btnEjercicio2, gbc_btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new AdministradorDeEventos("e3"));
		GridBagConstraints gbc_btnEjercicio3 = new GridBagConstraints();
		gbc_btnEjercicio3.insets = new Insets(0, 0, 5, 0);
		gbc_btnEjercicio3.gridx = 0;
		gbc_btnEjercicio3.gridy = 5;
		panel1.add(btnEjercicio3, gbc_btnEjercicio3);
	}
	@Override
	public void hacerVisible() {
		this.setVisible(true);
	}
}
