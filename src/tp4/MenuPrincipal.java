package tp4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MenuPrincipal extends JFrame implements Ventana {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(posX, posY, 358, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 81, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 17, 25, 25, 25, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblGrupoNro5 = new JLabel("GRUPO NRO: 3");
		lblGrupoNro5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GridBagConstraints gbc_lblGrupoNro5 = new GridBagConstraints();
		gbc_lblGrupoNro5.insets = new Insets(0, 0, 5, 0);
		gbc_lblGrupoNro5.gridx = 0;
		gbc_lblGrupoNro5.gridy = 1;
		contentPane.add(lblGrupoNro5, gbc_lblGrupoNro5);

		JButton btnEjerccicio1 = new JButton("Ejercicio 1");
		btnEjerccicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Ejercicio1()).hacerVisible();
			}
		});
		btnEjerccicio1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GridBagConstraints gbc_btnEjerccicio1 = new GridBagConstraints();
		gbc_btnEjerccicio1.anchor = GridBagConstraints.NORTH;
		gbc_btnEjerccicio1.insets = new Insets(0, 0, 5, 0);
		gbc_btnEjerccicio1.gridx = 0;
		gbc_btnEjerccicio1.gridy = 2;
		contentPane.add(btnEjerccicio1, gbc_btnEjerccicio1);

		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Ejercicio2()).hacerVisible();
			}
		});
		btnEjercicio2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GridBagConstraints gbc_btnEjercicio2 = new GridBagConstraints();
		gbc_btnEjercicio2.anchor = GridBagConstraints.NORTH;
		gbc_btnEjercicio2.insets = new Insets(0, 0, 5, 0);
		gbc_btnEjercicio2.gridx = 0;
		gbc_btnEjercicio2.gridy = 3;
		contentPane.add(btnEjercicio2, gbc_btnEjercicio2);

		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Ejercicio3()).hacerVisible();
			}
		});
		btnEjercicio3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GridBagConstraints gbc_btnEjercicio3 = new GridBagConstraints();
		gbc_btnEjercicio3.insets = new Insets(0, 0, 5, 0);
		gbc_btnEjercicio3.anchor = GridBagConstraints.NORTH;
		gbc_btnEjercicio3.gridx = 0;
		gbc_btnEjercicio3.gridy = 4;
		contentPane.add(btnEjercicio3, gbc_btnEjercicio3);
	}

	@Override
	public void hacerVisible() {
		this.setVisible(true);
	}
}
