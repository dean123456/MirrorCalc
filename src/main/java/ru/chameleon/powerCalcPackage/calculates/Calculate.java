package ru.chameleon.powerCalcPackage.calculates;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ru.chameleon.powerCalcPackage.exceptions.PowerCalcExceptions;
import ru.chameleon.powerCalcPackage.frames.CalcFrame;
import ru.chameleon.powerCalcPackage.model.Input;

public class Calculate implements ActionListener {

	CalcFrame cF;
	JLabel l7, l8, l9;
	JTextField t1, t2, t3;
	JButton b1, b2;

	public Calculate(CalcFrame cF) {
		this.cF = cF;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		t1 = cF.getT1();
		t2 = cF.getT2();
		t3 = cF.getT3();
		l7 = cF.getL7();
		l8 = cF.getL8();
		l9 = cF.getL9();
		b1 = cF.getB1();
		b2 = cF.getB2();
		try {
			if (e.getSource() == b1) {
				Input input = new Input(Integer.parseInt(t2.getText()), Integer.parseInt(t3.getText()),
						Integer.parseInt(t1.getText())).validate();

				int P = (int) (input.getI() * input.getU() * Math.cos(Math.toRadians(input.getFi())));
				int Q = (int) (input.getI() * input.getU() * Math.sin(Math.toRadians(input.getFi())));
				int S = input.getI() * input.getU();

				String s1 = "Активная мощность = " + P + " (Вт);";
				String s2 = "Реактивная мощность = " + Q + " (вар);";
				String s3 = "Полная мощность = " + S + " (ВА).";

				l7.setText(s1);
				l8.setText(s2);
				l9.setText(s3);
				cF.setSize(300, 210);
			}
			if (e.getSource() == b2) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				l7.setText(null);
				l8.setText(null);
				l9.setText(null);
				cF.setSize(300, 150);
			}
		} catch (PowerCalcExceptions ex) {
			JOptionPane.showMessageDialog(null, ex.getException());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Введите корректные данные");
		}
	}
}
