package ConversorMonedas;

import javax.swing.*;

public class ConvertirMonedas {

	public void ConvertirPesosADolares(double valorRecibido) {
		double monedaDolar = valorRecibido / 4801.53;
		monedaDolar = (double) Math.round(monedaDolar * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valorRecibido) {
		double monedaEuro = valorRecibido / 5068.89;
		monedaEuro = (double) Math.round(monedaEuro * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
		}
	
	public void ConvertirPesosALibras(double valorRecibido) {
		double monedaLibra = valorRecibido / 5915.30;
		monedaLibra = (double) Math.round(monedaLibra * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras");
		}
	
	public void ConvertirPesosAYen(double valorRecibido) {
		double monedaYen = valorRecibido / 35.33;
		monedaYen = (double) Math.round(monedaYen * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
		}
	
	public void ConvertirPesosAWon(double valorRecibido) {
		double monedaWon = valorRecibido / 3.71;
		monedaWon = (double) Math.round(monedaWon * 100) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wones");
		}
	}