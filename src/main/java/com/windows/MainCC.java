package com.windows;

public class MainCC {

	public static void main(String[] args) {
		CashDesk desk = new CashDesk();
		new Costumer ("Alex", desk);
		new Costumer ("Oksana", desk);
		new Costumer ("Tima", desk);
		new Costumer ("Mikle", desk);
		new Costumer ("Valia", desk);
	}

}
