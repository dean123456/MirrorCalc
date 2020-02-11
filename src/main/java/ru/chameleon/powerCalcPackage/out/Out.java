package ru.chameleon.powerCalcPackage.out;

import javax.swing.JFrame;

import ru.chameleon.powerCalcPackage.frames.CalcFrame;

public class Out {
	public static void main(String[] args) {
		CalcFrame cF = new CalcFrame("Калькулятор мощности");
		cF.setVisible(true);
		cF.setSize(300, 150);
		cF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cF.setResizable(false);
		cF.setLocationRelativeTo(null);
	}

}
