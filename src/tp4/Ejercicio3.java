package tp4;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio3 extends JDialog implements Ventana {
	private static final long serialVersionUID = 1L;
	private JTextField txtFdCantidadHoras;
	private JRadioButton rdbtnWindows;
	private JRadioButton rdbtnMac;
	private JRadioButton rdbtnLinux;
	private JCheckBox chckbxProgramacion;
	private JCheckBox chckbxAdministracion;
	private JCheckBox chckbxDiseñoGrafico;

	public Ejercicio3() {
		setTitle("Seleccion multiple");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(posX, posY, 450, 300);
		setModal(true);
		getContentPane().setLayout(null);

		JPanel panelSO = new JPanel();
		panelSO.setBorder(new LineBorder(Color.DARK_GRAY));
		panelSO.setBounds(25, 25, 380, 33);
		getContentPane().add(panelSO);
		GridBagLayout gbl_panelSO = new GridBagLayout();
		gbl_panelSO.columnWidths = new int[] { 172, 69, 45, 51, 0 };
		gbl_panelSO.rowHeights = new int[] { 23, 0 };
		gbl_panelSO.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelSO.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelSO.setLayout(gbl_panelSO);

		JLabel lblSistemas = new JLabel("Elije un sistema operativo");
		GridBagConstraints gbc_lblSistemas = new GridBagConstraints();
		gbc_lblSistemas.fill = GridBagConstraints.VERTICAL;
		gbc_lblSistemas.insets = new Insets(0, 0, 0, 5);
		gbc_lblSistemas.gridx = 0;
		gbc_lblSistemas.gridy = 0;
		panelSO.add(lblSistemas, gbc_lblSistemas);

		rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setSelected(true);
		GridBagConstraints gbc_rdbtnWindows = new GridBagConstraints();
		gbc_rdbtnWindows.fill = GridBagConstraints.BOTH;
		gbc_rdbtnWindows.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnWindows.gridx = 1;
		gbc_rdbtnWindows.gridy = 0;
		panelSO.add(rdbtnWindows, gbc_rdbtnWindows);

		rdbtnMac = new JRadioButton("Mac");
		GridBagConstraints gbc_rdbtnMac = new GridBagConstraints();
		gbc_rdbtnMac.fill = GridBagConstraints.BOTH;
		gbc_rdbtnMac.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnMac.gridx = 2;
		gbc_rdbtnMac.gridy = 0;
		panelSO.add(rdbtnMac, gbc_rdbtnMac);
		rdbtnLinux = new JRadioButton("Linux");
		GridBagConstraints gbc_rdbtnLinux = new GridBagConstraints();
		gbc_rdbtnLinux.fill = GridBagConstraints.BOTH;
		gbc_rdbtnLinux.gridx = 3;
		gbc_rdbtnLinux.gridy = 0;
		panelSO.add(rdbtnLinux, gbc_rdbtnLinux);

		JPanel panelEspecialidad = new JPanel();
		panelEspecialidad.setBorder(new LineBorder(Color.DARK_GRAY));
		panelEspecialidad.setBounds(25, 76, 380, 92);
		getContentPane().add(panelEspecialidad);
		GridBagLayout gbl_panelEspecialidad = new GridBagLayout();
		gbl_panelEspecialidad.columnWidths = new int[] { 192, 95, 0 };
		gbl_panelEspecialidad.rowHeights = new int[] { 23, 23, 23, 0 };
		gbl_panelEspecialidad.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelEspecialidad.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelEspecialidad.setLayout(gbl_panelEspecialidad);
		chckbxProgramacion = new JCheckBox("Programacion");
		GridBagConstraints gbc_chckbxProgramacion = new GridBagConstraints();
		gbc_chckbxProgramacion.anchor = GridBagConstraints.WEST;
		gbc_chckbxProgramacion.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxProgramacion.gridx = 1;
		gbc_chckbxProgramacion.gridy = 0;
		panelEspecialidad.add(chckbxProgramacion, gbc_chckbxProgramacion);

		JLabel lblEspecialidad = new JLabel("Elije una especialidad");
		GridBagConstraints gbc_lblEspecialidad = new GridBagConstraints();
		gbc_lblEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidad.gridx = 0;
		gbc_lblEspecialidad.gridy = 1;
		panelEspecialidad.add(lblEspecialidad, gbc_lblEspecialidad);

		chckbxAdministracion = new JCheckBox("Administracion");
		GridBagConstraints gbc_chckbxAdministracion = new GridBagConstraints();
		gbc_chckbxAdministracion.anchor = GridBagConstraints.WEST;
		gbc_chckbxAdministracion.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxAdministracion.gridx = 1;
		gbc_chckbxAdministracion.gridy = 1;
		panelEspecialidad.add(chckbxAdministracion, gbc_chckbxAdministracion);

		chckbxDiseñoGrafico = new JCheckBox("Dise\u00F1o Grafico");
		GridBagConstraints gbc_chckbxDiseñoGrafico = new GridBagConstraints();
		gbc_chckbxDiseñoGrafico.anchor = GridBagConstraints.WEST;
		gbc_chckbxDiseñoGrafico.gridx = 1;
		gbc_chckbxDiseñoGrafico.gridy = 2;
		panelEspecialidad.add(chckbxDiseñoGrafico, gbc_chckbxDiseñoGrafico);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnLinux);
		grupo.add(rdbtnMac);
		grupo.add(rdbtnWindows);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensaje();
			}
		});
		btnAceptar.setBounds(283, 227, 89, 23);
		getContentPane().add(btnAceptar);

		JPanel panelHoras = new JPanel();
		panelHoras.setBounds(25, 183, 380, 33);
		getContentPane().add(panelHoras);
		GridBagLayout gbl_panelHoras = new GridBagLayout();
		gbl_panelHoras.columnWidths = new int[] { 174, 86, 0 };
		gbl_panelHoras.rowHeights = new int[] { 20, 0 };
		gbl_panelHoras.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelHoras.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panelHoras.setLayout(gbl_panelHoras);

		JLabel lblCantidadHoras = new JLabel("Cantidad de horas en el computador");
		GridBagConstraints gbc_lblCantidadHoras = new GridBagConstraints();
		gbc_lblCantidadHoras.insets = new Insets(0, 0, 0, 5);
		gbc_lblCantidadHoras.gridx = 0;
		gbc_lblCantidadHoras.gridy = 0;
		panelHoras.add(lblCantidadHoras, gbc_lblCantidadHoras);
		txtFdCantidadHoras = new JTextField();
		txtFdCantidadHoras.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				verificarNumero(e);
			}
		});
		GridBagConstraints gbc_txtFdCantidadHoras = new GridBagConstraints();
		gbc_txtFdCantidadHoras.anchor = GridBagConstraints.WEST;
		gbc_txtFdCantidadHoras.gridx = 1;
		gbc_txtFdCantidadHoras.gridy = 0;
		panelHoras.add(txtFdCantidadHoras, gbc_txtFdCantidadHoras);
		txtFdCantidadHoras.setColumns(10);
	}

	@Override
	public void hacerVisible() {
		this.setVisible(true);
	}

	private void mensaje() {
		String seleccion = "";
		if (rdbtnMac.isSelected())
			seleccion = rdbtnMac.getText() + " - ";
		if (rdbtnWindows.isSelected())
			seleccion += rdbtnWindows.getText() + " - ";
		if (rdbtnLinux.isSelected())
			seleccion += rdbtnLinux.getText() + " - ";
		if (chckbxProgramacion.isSelected())
			seleccion += chckbxProgramacion.getText() + " - ";
		if (chckbxDiseñoGrafico.isSelected())
			seleccion += chckbxDiseñoGrafico.getText() + " - ";
		if (chckbxAdministracion.isSelected())
			seleccion += chckbxAdministracion.getText() + " - ";
		if (Util.validarNumeros(txtFdCantidadHoras))
			seleccion += txtFdCantidadHoras.getText() + " Hs";
		Util.alerta(seleccion);
	}

	private void verificarNumero(KeyEvent e) {
		if (Util.validarNumeros(e.getKeyChar())) {
			if (txtFdCantidadHoras.getText().length() > 4) {
				e.consume();
			}
		} else {
			Util.alerta("Debe ser un dato numérico.");
			e.consume();
		}
	}
}
