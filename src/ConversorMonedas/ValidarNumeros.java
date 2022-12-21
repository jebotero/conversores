package ConversorMonedas;

import javax.swing.*;

public class ValidarNumeros {

	public static boolean Validar(String input) {

		boolean respuesta;

		if (input.matches("[0-9]")) {
			JOptionPane.showMessageDialog(null, "ok, continue");
			respuesta = false;
		} else {
			JOptionPane.showConfirmDialog(null, "No es un numero, ingrese nuevamente");
			respuesta = true;
		}
		return respuesta;
	}
	
}
