package com.doomteam.ui;

import javax.swing.JFrame;

public class Ui {
	private static JFrame appUI = new JFrame("LifeSim");
	
	public Ui() {
		appUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appUI.setSize(800, 600);
		appUI.setVisible(true);
	}
}
