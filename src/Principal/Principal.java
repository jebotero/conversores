package Principal;

import javax.swing.*;

import ConversorMonedas.Function;
import ConversorTemperatura.FunctionTemperatura;

public class Principal {

	public static void main(String[] args) {
		
		Function monedas = new Function();
		FunctionTemperatura temperatura = new FunctionTemperatura();
		while(true) {
		String opciones = (JOptionPane.showInputDialog(null,
				"Seleccionar una opcion de conversion", 
				"Menu", JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] {"Conversor de Moneda", 
				"Conversor de Temperatura"}, 
				"Seleccion")).toString(); 
		switch (opciones) {
		case "Conversor de Moneda":
		String input = JOptionPane.showInputDialog("Ingrese cantidad de dinero a convertir");
			double Minput = Double.parseDouble(input);
			monedas.ConvertirMonedas(Minput);
			if(ValidarNumero(input) == true) {
				double valorRecibido = Double.parseDouble(input);
				monedas.ConvertirMonedas(valorRecibido);
				int respuesta = JOptionPane.showConfirmDialog(null, 
						"Deseas realizar otra conversion?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Seleccioina opcion afirmativa");
				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
				}
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
					break;
					
					
		case "Conversor de Temperatura":
			input = JOptionPane.showInputDialog("Ingresa el valor"
					+ " de la temperatura que deseas convertir");
			if(ValidarNumero(input) == true) {
				double Mtinput = Double.parseDouble(input);
				temperatura.ConvertirTemperatura(Mtinput);
				
				int respuesta = 0;
				respuesta = JOptionPane.showConfirmDialog(null,
						"¿Deseas continuar?");
			if((respuesta == 0) && (ValidarNumero(input) == true)) {
			} else {
				JOptionPane.showMessageDialog(null, "Programa terminado");
			}
			} else {
				JOptionPane.showMessageDialog(null, "Valor invalido");
			}
			break;
			}
		}
	}	
	
		public static boolean ValidarNumero(String input) {
			try {
				double x = Double.parseDouble(input);
				if(x >= 0 || x < 0);
				return true;
			} catch
			(NumberFormatException e) {
				return false;
			}
			
		}
	}
	
