package powerCalcPackage;

import javax.swing.JFrame;

public class Out {
	public static void main(String[] args) {
		Input i = new Input("Калькулятор мощности");
		i.setVisible(true);
		i.setSize(300, 150);
		i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		i.setResizable(false);
		i.setLocationRelativeTo(null);

	}

}
