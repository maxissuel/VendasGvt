/**@author maxissuel
 * */
package com.example.vendasgvt;

public class Banda {
	private double valores[];
	private double valorDesc[];
	private double taxaInst[];
	
	public Banda(){
		valores = new double[7];
		valorDesc = new double[7];
		taxaInst = new double[7];
		
		valores[0] = 79.9;
		valores[1] = 94.9;
		valores[2] = 99.9;
		valores[3] = 109.9;
		valores[4] = 119.9;
		valores[5] = 129.9;
		valores[6] = 229.9;

		valorDesc[0] = 59.9;
		valorDesc[1] = 74.9;
		valorDesc[2] = 79.9;
		valorDesc[3] = 89.9;
		valorDesc[4] = 99.9;
		valorDesc[5] = 109.9;
		valorDesc[6] = 209.9;
		
		taxaInst[0] = 29.9;
		taxaInst[1] = 49.9;
		taxaInst[2] = 49.9;
		taxaInst[3] = 99.9;
		taxaInst[4] = 99.9;
		taxaInst[5] = 99.9;
		taxaInst[6] = 199.9;

	}
	public double[] getValorDesc() {
		return valorDesc;
	}

	public double[] getValores() {
		return valores;
	}
}
