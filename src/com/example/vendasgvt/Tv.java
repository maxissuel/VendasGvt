/**@author maxissuel
 * */
package com.example.vendasgvt;

public class Tv {
	private double valores[];
	private double valorDesc[];
	private double taxaPP;
	
	public Tv(){
		valores = new double[3];
		valorDesc = new double[3];
		taxaPP = 24.90;
		
		valores[0] = 109.9;
		valores[1] = 139.9;
		valores[2] = 179.9;
		
		valorDesc[0] = 79.9;
		valorDesc[1] = 109.9;
		valorDesc[2] = 149.9;
	}

	public double getTaxaPP() {
		return taxaPP;
	}

	public double[] getValorDesc() {
		return valorDesc;
	}

	public double[] getValores() {
		return valores;
	}
}
