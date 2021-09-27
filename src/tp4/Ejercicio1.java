package tp4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JDialog implements Ventana {
	private final JPanel CntPnlContacto = new JPanel();
	private static final long serialVersionUID = 1L;
	private JTextField txtFdNombre;
	private JTextField txtFdApellido;
	private JTextField txtFdTelefono;
	private JTextField txtFdFechaNac;
	private JButton btnMostrar;
	private JLabel lblDatosIng;
	private JLabel lblNombreResultado;
	private JLabel lblApellidoResultado;
	private JLabel lblTelefonoResultado;
	private JLabel lblFechaResultado;

	public Ejercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setFont(new Font("Times New Roman", Font.BOLD, 12));
		setModal(true);
		setBounds(posX, posY, 409, 327);
		getContentPane().setLayout(new BorderLayout());
		CntPnlContacto.setToolTipText("");
		CntPnlContacto.setForeground(new Color(0, 0, 0));
		CntPnlContacto.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(CntPnlContacto, BorderLayout.CENTER);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setLabelFor(this);
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 12));

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD, 12));

		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Times New Roman", Font.BOLD, 12));

		JLabel lblFechaNac = new JLabel("Fecha Nac");
		lblFechaNac.setFont(new Font("Times New Roman", Font.BOLD, 12));

		txtFdNombre = new JTextField();
		txtFdNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				txtFdNombre.setBackground(Color.WHITE);
			}
		});
		txtFdNombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFdNombre.setColumns(10);

		txtFdApellido = new JTextField();
		txtFdApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtFdApellido.setBackground(Color.WHITE);
			}
		});
		txtFdApellido.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFdApellido.setColumns(10);

		txtFdTelefono = new JTextField();
		txtFdTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtFdTelefono.setBackground(Color.WHITE);
			}
		});
		txtFdTelefono.setColumns(10);
		txtFdFechaNac = new JTextField();
		txtFdFechaNac.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtFdFechaNac.setBackground(Color.WHITE);
			}
		});
		txtFdFechaNac.setToolTipText("");
		txtFdFechaNac.setColumns(10);

		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int contador = 0;
				if (!Util.validarTexto(txtFdNombre)) {
					txtFdNombre.setBackground(Color.RED);
				} else {
					contador++;
				}
				if (!Util.validarTexto(txtFdApellido)) {
					txtFdApellido.setBackground(Color.RED);
				} else {
					contador++;
				}
				if (!Util.validarNumeros(txtFdTelefono)) {
					txtFdTelefono.setBackground(Color.RED);
				} else {
					contador++;
				}
				if (Util.camposVacios(txtFdFechaNac)) {
					txtFdFechaNac.setBackground(Color.RED);
				} else {
					contador++;
				}
				if (contador == 4) {
					lblNombreResultado.setText("Nombre: " + txtFdNombre.getText().trim());
					txtFdNombre.setText(null);
					lblApellidoResultado.setText("Apellido: " + txtFdApellido.getText().trim());
					txtFdApellido.setText(null);
					lblTelefonoResultado.setText("Telefono: " + txtFdTelefono.getText().trim());
					txtFdTelefono.setText(null);
					lblFechaResultado.setText("Fecha Nac: " + txtFdFechaNac.getText().trim());
					txtFdFechaNac.setText(null);

				} else {
					Util.alerta("Verifique los datos ingresados.");
					lblNombreResultado.setText(null);
					lblApellidoResultado.setText(null);
					lblTelefonoResultado.setText(null);
					lblFechaResultado.setText(null);
				}
			}
		});
		btnMostrar.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		lblDatosIng = new JLabel("Los datos ingresados fueron:");
		lblDatosIng.setFont(new Font("Times New Roman", Font.BOLD, 12));

		lblNombreResultado = new JLabel("");
		lblNombreResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		lblApellidoResultado = new JLabel("");
		lblApellidoResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		lblTelefonoResultado = new JLabel("");
		lblTelefonoResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));

		lblFechaResultado = new JLabel("");
		lblFechaResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		GroupLayout gl_CntPnlContacto = new GroupLayout(CntPnlContacto);
		gl_CntPnlContacto.setHorizontalGroup(gl_CntPnlContacto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CntPnlContacto.createSequentialGroup().addGap(41)
						.addGroup(gl_CntPnlContacto.createParallelGroup(Alignment.LEADING).addComponent(lblTelefono)
								.addComponent(lblApellido).addComponent(lblNombre).addComponent(lblFechaNac))
						.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
						.addGroup(gl_CntPnlContacto.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtFdFechaNac)
								.addComponent(txtFdNombre, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
								.addComponent(txtFdApellido).addComponent(txtFdTelefono))
						.addContainerGap(97, Short.MAX_VALUE))
				.addGroup(gl_CntPnlContacto.createSequentialGroup().addContainerGap().addComponent(lblDatosIng)
						.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE).addComponent(btnMostrar)
						.addGap(22))
				.addGroup(gl_CntPnlContacto.createSequentialGroup().addContainerGap()
						.addComponent(lblNombreResultado, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
						.addContainerGap())
				.addGroup(gl_CntPnlContacto.createSequentialGroup().addContainerGap()
						.addComponent(lblApellidoResultado, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_CntPnlContacto.createSequentialGroup().addContainerGap()
						.addComponent(lblTelefonoResultado, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_CntPnlContacto.createSequentialGroup().addContainerGap()
						.addComponent(lblFechaResultado, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_CntPnlContacto
				.setVerticalGroup(gl_CntPnlContacto.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_CntPnlContacto.createSequentialGroup().addContainerGap()
								.addGroup(gl_CntPnlContacto.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNombre).addComponent(txtFdNombre, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_CntPnlContacto.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblApellido).addComponent(txtFdApellido,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_CntPnlContacto.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblTelefono).addComponent(txtFdTelefono,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_CntPnlContacto.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFechaNac).addComponent(txtFdFechaNac,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_CntPnlContacto.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnMostrar).addComponent(lblDatosIng))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblNombreResultado, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblApellidoResultado, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblTelefonoResultado, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblFechaResultado, GroupLayout.PREFERRED_SIZE, 23,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		CntPnlContacto.setLayout(gl_CntPnlContacto);
	}

	@Override
	public void hacerVisible() {
		this.setVisible(true);
	}
}
