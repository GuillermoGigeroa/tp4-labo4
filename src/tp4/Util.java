package tp4;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public abstract class Util {

	// Metodo que verifica si el campo esta vacio
	public static boolean camposVacios(JTextField label) {
		int contador = 0;
		String texto = label.getText().trim();
		if (texto.length() == 0) {
			return true;
		} else {
			for (int i = 0; i < texto.length(); i++) {
				if (texto.charAt(i) == ' ') {
					contador++;
				}
			}
		}
		if (texto.length() == contador) {
			return true;
		}
		return false;
	}

	// Metodo que verifica si contiene letras
	public static boolean validarTexto(JTextField label) {
		int contador = 0;
		String texto = label.getText().trim();
		if (camposVacios(label) == false) {
			for (int i = 0; i < texto.length(); i++) {
				int codigo = (int) texto.charAt(i);
				if ((codigo >= 65 && codigo <= 90) || (codigo >= 97 && codigo <= 122) || codigo == 32) {
					contador++;
				}
			}
		} else {
			return false;
		}
		if (contador == texto.length()) {
			return true;
		}
		return false;
	}

	// Metodo que verifica campos con numeros
	public static boolean validarNumeros(JTextField label) {
		int contador = 0;
		String texto = label.getText();
		if (camposVacios(label) == false) {
			for (int i = 0; i < texto.length(); i++) {

				int codigo = (int) texto.charAt(i);

				if ((codigo >= 48 && codigo <= 57)) {
					contador++;
				}
			}
		} else {
			return false;
		}
		if (contador == texto.length()) {
			return true;
		}
		return false;
	}

	public static boolean validarNumeros(char codigo) {
		if ((codigo >= 48 && codigo <= 57) || codigo == 8 || codigo == 127) {
			return true;
		}
		return false;
	}

	// Metodo que convierte a float
	public static float convertirAFloat(JTextField texto) {
		float numero = 0;
		if (validarNumeros(texto)) {
			if (Float.valueOf(texto.getText()).floatValue() > 0 && Float.valueOf(texto.getText()).floatValue() < 11) {
				numero = Float.valueOf(texto.getText()).floatValue();
				return numero;
			}
		}
		return numero;
	}

	// Metodo que calcula la condicion
	public static String calcularCondicion(JTextField uno, JTextField dos, JTextField tres, JComboBox<String> frase) {
		String condicion = "";
		if ((String) frase.getSelectedItem() == "Desaprobado") {
			condicion = "Libre";
			return condicion;
		} else {
			if ((convertirAFloat(uno) >= 8 && convertirAFloat(dos) >= 8) && convertirAFloat(tres) >= 8) {
				condicion = "Promocionado";
				return condicion;
			} else {
				if ((convertirAFloat(uno) >= 6 || convertirAFloat(dos) >= 6) || convertirAFloat(tres) >= 6) {
					condicion = "Regular";
					return condicion;
				}
			}
		}
		condicion = "Libre";
		return condicion;
	}

	// Metodo que calcula el promedio
	public static float calcularPromedio(JTextField uno, JTextField dos, JTextField tres) {
		float promedio = 0;
		if ((convertirAFloat(uno) != 0 && convertirAFloat(dos) != 0) && convertirAFloat(tres) != 0) {
			float nota1 = Float.valueOf(uno.getText()).floatValue();
			float nota2 = Float.valueOf(dos.getText()).floatValue();
			float nota3 = Float.valueOf(tres.getText()).floatValue();
			promedio = (nota1 + nota2 + nota3) / 3;
			return promedio;
		}
		return promedio;
	}

	// Metodo para enviar alertas en pantalla
	public static void alerta(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}
	
	
}
