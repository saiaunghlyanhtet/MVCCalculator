package mvc.calculator;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {
	
	private JTextField firstnumber = new JTextField(10);
	private JLabel additionLabel = new JLabel ("+");
	private JTextField secondnumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	public JComboBox comboBox;
	CalculatorView() {
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		String[] mathsOperators = { "+", "-", "*", "/", "%"};
		comboBox = new JComboBox(mathsOperators);
		
	
		
		calcPanel.add(firstnumber);
		calcPanel.add(comboBox);
		calcPanel.add(secondnumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	}
	
	public int getFirstNumber() {
		return Integer.parseInt(firstnumber.getText());
	}
	
	public int getSecondNumber() {
		return Integer.parseInt(secondnumber.getText());
	}
	
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenForCalcButton) {
		calculateButton.addActionListener(listenForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
