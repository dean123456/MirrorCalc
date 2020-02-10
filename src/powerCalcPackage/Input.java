package powerCalcPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Input extends JFrame {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JTextField t1, t2, t3;
	JButton b1, b2;
	int P, Q, S, i, u;
	int fi;
	String s1, s2, s3;
	Raschet r = new Raschet();
	public Input (String s){
		super(s);
		setLayout(new FlowLayout());
		l1 = new JLabel("Введите значение угла:");
		l2 = new JLabel("(град);");
		l3 = new JLabel("Введите значение тока:");
		l4 = new JLabel("(А);");
		l5 = new JLabel("Введите значеие напряжения:");
		l6 = new JLabel("(В);");
		t1 = new JTextField(5);
		t2 = new JTextField(5);
		t3 = new JTextField(5);
		b1 = new JButton("Рассчитать");
		b2 = new JButton("Очистить");
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
		b1.addActionListener(r);
		b2.addActionListener(r);
	}
	public class Raschet implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
				if (e.getSource() == b1){
					fi = Integer.parseInt(t1.getText());
					i = Integer.parseInt(t2.getText());
					u = Integer.parseInt(t3.getText());
					P = (int)(i*u*Math.cos(Math.toRadians(fi)));
					Q = (int)(i*u*Math.sin(Math.toRadians(fi)));
					S = i*u;
					s1 = "Активная мощность = " + P + " (Вт);";
					s2 = "Реактивная мощность = " + Q + " (вар);";
					s3 = "Полная мощность = " + S + " (ВА).";
					l7.setText(s1);
					l8.setText(s2);
					l9.setText(s3);
					setSize(300, 210);
				}
				if (e.getSource() == b2){
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
					l7.setText(null);
					l8.setText(null);
					l9.setText(null);
					setSize(300, 150);
				}
			} catch (Exception ex) {JOptionPane.showMessageDialog(null, "Введите в поле целое число");}	
		}
		
	}

}
