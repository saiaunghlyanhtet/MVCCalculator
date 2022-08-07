package mvc.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	private CalculatorModel theModel;
	private CalculatorView theView;
	
	public CalculatorController( CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculationListener());
	}
	
	class CalculationListener implements ActionListener {
		
	public void actionPerformed(ActionEvent e) {
		int firstNumber = 0;
		int secondNumber = 0;
		
		try
		{
			
			firstNumber = theView.getFirstNumber();
			secondNumber = theView.getSecondNumber();
			
			if (theView.comboBox.getSelectedIndex()==0) {
			theModel.addTwoNumbers(firstNumber, secondNumber);
			theView.setCalcSolution(theModel.getCaculationValue());
			}
			
			if (theView.comboBox.getSelectedIndex()==1) {
			theModel.subtractTwoNumbers(firstNumber, secondNumber);
			theView.setCalcSolution(theModel.getCaculationValue());
			}
			
			if (theView.comboBox.getSelectedIndex()==2) {
			theModel.multiplyTwoNumbers(firstNumber, secondNumber);
			theView.setCalcSolution(theModel.getCaculationValue());
			}
			
			if (theView.comboBox.getSelectedIndex()==3) {
			theModel.divideTwoNumbers(firstNumber, secondNumber);
			theView.setCalcSolution(theModel.getCaculationValue());
			}
			
			if (theView.comboBox.getSelectedIndex()==4) {
			theModel.modulus(firstNumber, secondNumber);
			theView.setCalcSolution(theModel.getCaculationValue());
			}
			
			
			
		}
		
		catch(NumberFormatException ex) {
			theView.displayErrorMessage("You need to enter two intergers");
			
		}
	}
	}
}
