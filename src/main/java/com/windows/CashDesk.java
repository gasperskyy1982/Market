package com.windows;

import java.util.concurrent.TimeUnit;

public class CashDesk {
	static volatile boolean checkNotBusy = true;
	static volatile boolean checkBuy = true;
	static volatile boolean checkDeskBreak = false;
	private Costumer costumer;

	
	public synchronized void getDesk() {
		 try {
		 TimeUnit.SECONDS.sleep(1);
		 } catch (InterruptedException e1) { };
		
		 if (!checkDeskBreak) {
			if (!checkNotBusy) {
				System.out.println("Касса занята");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {};
			} else {
				System.out.println("\nКасса свободна");
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e1) {};
				checkNotBusy = false;
				checkBuy = false;

				int check = (int) ((Math.random() * 1000) / 500);
				if (check < 1)
					checkDeskBreak = true;
				else
					checkDeskBreak = false;
				
				System.out.println(checkDeskBreak == true ? "Касса на перерыве\n" : "");
		}
		} else {
			checkBuy = false;

		}

	}
}
