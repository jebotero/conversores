package ConversorMonedas;

import javax.swing.*;

public class Function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
	public void ConvertirMonedas(double ValorRecibido) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Seleccionar una opcion de conversion de dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] 
				{"De Pesos a Dólar", "De Pesos a Euros" , "De Pesos a Libras",
						"De Pesos a Yen", "De Pesos a Won coreano",
						"De Dólar a Pesos", "De Euros a Pesos", "De Libras a Pesos", 
						"De Yen a Pesos", "De Won coreano a Pesos"},
				"Seleccion")).toString();
		switch (opcion) {
		case "De Pesos a Dólar":
			monedas.ConvertirPesosADolares(ValorRecibido);
			break;
		case "De Pesos a Euros":
			monedas.ConvertirPesosAEuros(ValorRecibido);
			break;
		case "De Pesos a Libras":
			monedas.ConvertirPesosALibras(ValorRecibido);
			break;
		case "De Pesos a Yen":
			monedas.ConvertirPesosAYen(ValorRecibido);
			break;
		case "De Pesos a Won coreano":
			monedas.ConvertirPesosAWon(ValorRecibido);
			break;
		case "De Dólar a Pesos":
			pesos.ConvertirDolaresAPesos(ValorRecibido);
			break;
		case "De Euros a Pesos":
			pesos.ConvertirEurosAPesos(ValorRecibido);
			break;
		case "De Libras a Pesos":
			pesos.ConvertirLibrasAPesos(ValorRecibido);
			break;		
		case "De Yen a Pesos":
			pesos.ConvertirYenAPesos(ValorRecibido);
			break;				
		case "De Won a Pesos":
			pesos.ConvertirWonAPesos(ValorRecibido);				
			break;
		}
	}
}