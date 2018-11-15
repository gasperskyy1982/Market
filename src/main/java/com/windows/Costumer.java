package com.windows;

public class Costumer implements Runnable {
	private String name;
	private CashDesk desk;

	public Costumer(String name, CashDesk desk) {
		this.name = name;
		this.desk = desk;
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println(name + " В очереди");
		
		while (CashDesk.checkBuy) {
			desk.getDesk();
		}
		if (!CashDesk.checkDeskBreak) {
			System.out.println(name + " Обслужен");
			CashDesk.checkBuy = true;
			CashDesk.checkNotBusy = true;
		} else {
			System.out.println(name + " Не обслужен");
		}

	}
}
