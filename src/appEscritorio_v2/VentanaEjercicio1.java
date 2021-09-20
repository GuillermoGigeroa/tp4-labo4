package appEscritorio_v2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;

public class VentanaEjercicio1 extends JFrame implements Ventana {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JLabel lblFechaNac;
	private JTextField txtFechanac;
	private JButton btnMostrar;
	private JLabel lblDatosIngresados;
	private JLabel lblResultado;
	public VentanaEjercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(posX, posY, ancho, alto);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 160, 0};
		gbl_contentPane.rowHeights = new int[]{0, 14, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 0;
		contentPane.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 0;
		gbc_lblApellido.gridy = 1;
		contentPane.add(lblApellido, gbc_lblApellido);
		
		txtApellido = new JTextField();
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 1;
		contentPane.add(txtApellido, gbc_txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 2;
		contentPane.add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 2;
		gbc_txtTelefono.gridy = 2;
		contentPane.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		lblFechaNac = new JLabel("Fecha nac.");
		GridBagConstraints gbc_lblFechaNac = new GridBagConstraints();
		gbc_lblFechaNac.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaNac.gridx = 0;
		gbc_lblFechaNac.gridy = 3;
		contentPane.add(lblFechaNac, gbc_lblFechaNac);
		
		txtFechanac = new JTextField();
		GridBagConstraints gbc_txtFechanac = new GridBagConstraints();
		gbc_txtFechanac.insets = new Insets(0, 0, 5, 0);
		gbc_txtFechanac.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechanac.gridx = 2;
		gbc_txtFechanac.gridy = 3;
		contentPane.add(txtFechanac, gbc_txtFechanac);
		txtFechanac.setColumns(10);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new AdministradorDeEventos("mostrar"));
		GridBagConstraints gbc_btnMostrar = new GridBagConstraints();
		gbc_btnMostrar.anchor = GridBagConstraints.EAST;
		gbc_btnMostrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnMostrar.gridx = 2;
		gbc_btnMostrar.gridy = 4;
		contentPane.add(btnMostrar, gbc_btnMostrar);
		
		lblDatosIngresados = new JLabel("Los datos ingresados fueron:");
		GridBagConstraints gbc_lblDatosIngresados = new GridBagConstraints();
		gbc_lblDatosIngresados.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDatosIngresados.gridwidth = 2;
		gbc_lblDatosIngresados.insets = new Insets(0, 0, 0, 5);
		gbc_lblDatosIngresados.gridx = 0;
		gbc_lblDatosIngresados.gridy = 5;
		contentPane.add(lblDatosIngresados, gbc_lblDatosIngresados);
		
		lblResultado = new JLabel("");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.gridx = 2;
		gbc_lblResultado.gridy = 5;
		contentPane.add(lblResultado, gbc_lblResultado);
	}
	@Override
	public void hacerVisible() {
			this.setVisible(true);
	}
}
