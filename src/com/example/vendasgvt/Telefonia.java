/**@author maxissuel
 * */
package com.example.vendasgvt;

public class Telefonia {
	private double valores[];
	private double valorDesc[];
	private double taxaInst;
	
	public Telefonia(){
		valores = new double[3];
		valorDesc = new double[3];
		
		taxaInst = 15;
		
		valores[0] = 79.9;
		valores[1] = 89.9;
		valores[2] = 109.9;
		
		valorDesc[0] = 49.9;
		valorDesc[1] = 59.9;
		valorDesc[2] = 79.9;
	}
	
	public double getTaxaInst() {
		return taxaInst;
	}

	public double[] getValorDesc() {
		return valorDesc;
	}

	public double[] getValores() {
		return valores;
	}
}
