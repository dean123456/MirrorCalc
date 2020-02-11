package ru.chameleon.powerCalcPackage.frames;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ru.chameleon.powerCalcPackage.calculates.Calculate;
import ru.chameleon.powerCalcPackage.resources.Strings;

public class CalcFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JTextField t1, t2, t3;
	JButton b1, b2;

	public CalcFrame(String s) {
		super(s);
		setLayout(new FlowLayout());
		l1 = new JLabel(Strings.FI.getStrings());
		l2 = new JLabel(Strings.GRAD.getStrings());
		l3 = new JLabel(Strings.I.getStrings());
		l4 = new JLabel(Strings.A.getStrings());
		l5 = new JLabel(Strings.U.getStrings());
		l6 = new JLabel(Strings.V.getStrings());
		t1 = new JTextField(5);
		t2 = new JTextField(5);
		t3 = new JTextField(5);
		b1 = new JButton(Strings.COMPUTE.getStrings());
		b2 = new JButton(Strings.CLEAR.getStrings());
		l7 = new JLabel("");
		l8 = new JLabel("");
		l9 = new JLabel("");
		add(l1);
		add(t1);
		add(l2);
		add(l3);
		add(t2);
		add(l4);
		add(l5);
		add(t3);
		add(l6);
		add(b1);
		add(b2);
		add(l7);
		add(l8);
		add(l9);
		b1.addActionListener(new Calculate(this));
		b2.addActionListener(new Calculate(this));
	}

	public JTextField getT1() {
		return t1;
	}

	public JTextField getT2() {
		return t2;
	}

	public JTextField getT3() {
		return t3;
	}

	public JButton getB1() {
		return b1;
	}

	public JButton getB2() {
		return b2;
	}

	public JLabel getL7() {
		return l7;
	}

	public JLabel getL8() {
		return l8;
	}

	public JLabel getL9() {
		return l9;
	}

}
