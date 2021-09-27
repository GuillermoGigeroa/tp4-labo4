package tp4;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JDialog implements Ventana {
	private static final long serialVersionUID = 1L;
	private JTextField txtFdNota1;
	private JTextField txtFdNota2;
	private JTextField txtFdNota3;
	private JTextField txtFdPromedio;
	private JTextField txtFdCondicion;
	private JComboBox<String> cbTps;

	public Ejercicio2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(posX, posY, 396, 360);
		setModal(true);

		JPanel fondoNotas1 = new JPanel();
		fondoNotas1.setBounds(26, 11, 125, 20);
		getContentPane().add(fondoNotas1);
		fondoNotas1.setLayout(null);

		JLabel lblNotasDelEstudiante = new JLabel("Notas del estudiante");
		lblNotasDelEstudiante.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotasDelEstudiante.setBounds(0, 5, 125, 14);
		fondoNotas1.add(lblNotasDelEstudiante);

		JPanel notasPanel = new JPanel();
		notasPanel.setBounds(10, 22, 242, 142);
		notasPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		getContentPane().add(notasPanel);
		GridBagLayout gbl_notasPanel = new GridBagLayout();
		gbl_notasPanel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_notasPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_notasPanel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_notasPanel.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		notasPanel.setLayout(gbl_notasPanel);
		JLabel lblNota1 = new JLabel("Nota 1");
		GridBagConstraints gbc_lblNota1 = new GridBagConstraints();
		gbc_lblNota1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota1.gridx = 1;
		gbc_lblNota1.gridy = 1;
		notasPanel.add(lblNota1, gbc_lblNota1);
		lblNota1.setFont(new Font("Times New Roman", Font.BOLD, 12));

		cbTps = new JComboBox<String>();
		GridBagConstraints gbc_cbTps = new GridBagConstraints();
		gbc_cbTps.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbTps.insets = new Insets(0, 0, 5, 5);
		gbc_cbTps.gridx = 3;
		gbc_cbTps.gridy = 4;
		notasPanel.add(cbTps, gbc_cbTps);
		cbTps.setAutoscrolls(true);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setBounds(262, 57, 105, 35);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		btnNuevo.setBounds(262, 93, 105, 35);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		btnSalir.setBounds(262, 129, 105, 35);
		getContentPane().setLayout(null);

		JPanel fondoNotas2 = new JPanel();
		fondoNotas2.setBounds(26, 170, 125, 20);
		getContentPane().add(fondoNotas2);
		fondoNotas2.setLayout(null);

		JLabel label = new JLabel("Notas del estudiante");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 5, 125, 14);
		fondoNotas2.add(label);
		getContentPane().add(btnNuevo);
		getContentPane().add(btnSalir);
		getContentPane().add(btnCalcular);

		txtFdNota1 = new JTextField();
		txtFdNota1.addKeyListener(new MaximoDosNumeros(txtFdNota1));
		GridBagConstraints gbc_txtFdNota1 = new GridBagConstraints();
		gbc_txtFdNota1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFdNota1.insets = new Insets(0, 0, 5, 5);
		gbc_txtFdNota1.gridx = 3;
		gbc_txtFdNota1.gridy = 1;
		notasPanel.add(txtFdNota1, gbc_txtFdNota1);
		txtFdNota1.setColumns(10);

		JLabel lblNota2 = new JLabel("Nota 2");
		GridBagConstraints gbc_lblNota2 = new GridBagConstraints();
		gbc_lblNota2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota2.gridx = 1;
		gbc_lblNota2.gridy = 2;
		notasPanel.add(lblNota2, gbc_lblNota2);
		lblNota2.setFont(new Font("Times New Roman", Font.BOLD, 12));

		txtFdNota2 = new JTextField();
		txtFdNota2.addKeyListener(new MaximoDosNumeros(txtFdNota2));
		GridBagConstraints gbc_txtFdNota2 = new GridBagConstraints();
		gbc_txtFdNota2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFdNota2.insets = new Insets(0, 0, 5, 5);
		gbc_txtFdNota2.gridx = 3;
		gbc_txtFdNota2.gridy = 2;
		notasPanel.add(txtFdNota2, gbc_txtFdNota2);
		txtFdNota2.setColumns(10);

		JLabel lblNota3 = new JLabel("Nota 3");
		GridBagConstraints gbc_lblNota3 = new GridBagConstraints();
		gbc_lblNota3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota3.gridx = 1;
		gbc_lblNota3.gridy = 3;
		notasPanel.add(lblNota3, gbc_lblNota3);
		lblNota3.setFont(new Font("Times New Roman", Font.BOLD, 12));

		txtFdNota3 = new JTextField();
		txtFdNota3.addKeyListener(new MaximoDosNumeros(txtFdNota3));
		GridBagConstraints gbc_txtFdNota3 = new GridBagConstraints();
		gbc_txtFdNota3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFdNota3.insets = new Insets(0, 0, 5, 5);
		gbc_txtFdNota3.gridx = 3;
		gbc_txtFdNota3.gridy = 3;
		notasPanel.add(txtFdNota3, gbc_txtFdNota3);
		txtFdNota3.setColumns(10);

		JLabel lblTPS = new JLabel("TPS:");
		GridBagConstraints gbc_lblTPS = new GridBagConstraints();
		gbc_lblTPS.insets = new Insets(0, 0, 5, 5);
		gbc_lblTPS.gridx = 1;
		gbc_lblTPS.gridy = 4;
		notasPanel.add(lblTPS, gbc_lblTPS);
		lblTPS.setFont(new Font("Times New Roman", Font.BOLD, 12));

		JPanel panelResultados = new JPanel();
		panelResultados.setBounds(10, 180, 242, 96);
		panelResultados.setBorder(new LineBorder(Color.LIGHT_GRAY));
		getContentPane().add(panelResultados);
		GridBagLayout gbl_panelResultados = new GridBagLayout();
		gbl_panelResultados.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelResultados.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panelResultados.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelResultados.rowWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panelResultados.setLayout(gbl_panelResultados);

		JLabel lblPromedio = new JLabel("Promedio");
		GridBagConstraints gbc_lblPromedio = new GridBagConstraints();
		gbc_lblPromedio.insets = new Insets(0, 0, 5, 5);
		gbc_lblPromedio.gridx = 1;
		gbc_lblPromedio.gridy = 1;
		panelResultados.add(lblPromedio, gbc_lblPromedio);

		txtFdPromedio = new JTextField();
		txtFdPromedio.setEditable(false);
		GridBagConstraints gbc_txtFdPromedio = new GridBagConstraints();
		gbc_txtFdPromedio.insets = new Insets(0, 0, 5, 5);
		gbc_txtFdPromedio.gridx = 3;
		gbc_txtFdPromedio.gridy = 1;
		panelResultados.add(txtFdPromedio, gbc_txtFdPromedio);
		txtFdPromedio.setColumns(10);

		JLabel lblCondicion = new JLabel("Condicion");
		GridBagConstraints gbc_lblCondicion = new GridBagConstraints();
		gbc_lblCondicion.insets = new Insets(0, 0, 5, 5);
		gbc_lblCondicion.gridx = 1;
		gbc_lblCondicion.gridy = 2;
		panelResultados.add(lblCondicion, gbc_lblCondicion);

		txtFdCondicion = new JTextField();
		txtFdCondicion.setEditable(false);
		GridBagConstraints gbc_txtFdCondicion = new GridBagConstraints();
		gbc_txtFdCondicion.insets = new Insets(0, 0, 5, 5);
		gbc_txtFdCondicion.gridx = 3;
		gbc_txtFdCondicion.gridy = 2;
		panelResultados.add(txtFdCondicion, gbc_txtFdCondicion);
		txtFdCondicion.setColumns(10);
		cbTps.addItem("Aprobado");
		cbTps.addItem("Desaprobado");
	}

	@Override
	public void hacerVisible() {
		this.setVisible(true);
	}

	private void salir() {
		this.setVisible(false);
	}

	private void calcular() {
		if (Util.calcularPromedio(txtFdNota1, txtFdNota2, txtFdNota3) != 0) {
			txtFdPromedio.setText(String.valueOf(Util.calcularPromedio(txtFdNota1, txtFdNota2, txtFdNota3)));
			txtFdCondicion.setText(Util.calcularCondicion(txtFdNota1, txtFdNota2, txtFdNota3, cbTps));
			txtFdNota1.setText(null);
			txtFdNota2.setText(null);
			txtFdNota3.setText(null);
		} else {
			Util.alerta("Ingresar números del 1 al 10.");
		}
	}

	private void vaciarCampos() {
		txtFdNota1.setText(null);
		txtFdNota2.setText(null);
		txtFdNota3.setText(null);
		txtFdCondicion.setText(null);
		txtFdPromedio.setText(null);
	}
}
