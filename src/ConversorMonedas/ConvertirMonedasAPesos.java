package ConversorMonedas;

import javax.swing.*;

public class ConvertirMonedasAPesos {

	public void ConvertirDolaresAPesos(double valorRecibido) {
		double monedaDolar = valorRecibido * 4801.53;
		monedaDolar = (double) Math.round(monedaDolar * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos colombianos");
	}
	
	public void ConvertirEurosAPesos(double valorRecibido) {
		double monedaEuro = valorRecibido * 5068.89;
		monedaEuro = (double) Math.round(monedaEuro * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos colombianos");
		}
	
	public void ConvertirLibrasAPesos(double valorRecibido) {
		double monedaLibra = valorRecibido * 5915.30;
		monedaLibra = (double) Math.round(monedaLibra * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos colombianos");
		}
	
	public void ConvertirYenAPesos(double valorRecibido) {
		double monedaYen = valorRecibido * 35.33;
		monedaYen = (double) Math.round(monedaYen * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos colombianos");
		}
	
	public void ConvertirWonAPesos(double valorRecibido) {
		double monedaWon = valorRecibido * 3.71;
		monedaWon = (double) Math.round(monedaWon * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos colombianos");
		}
	}