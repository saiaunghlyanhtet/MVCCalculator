package mvc.calculator;

public class CalculatorModel {
	
	private int calculationValue;
	
	public void addTwoNumbers(int firstnumber, int secondnumber) {
		calculationValue = firstnumber + secondnumber;
	}
	
	public void subtractTwoNumbers(int firstnumber, int secondnumber) {
		calculationValue = firstnumber - secondnumber;
	}
	
	public void multiplyTwoNumbers(int firstnumber, int secondnumber) {
		calculationValue = firstnumber * secondnumber;
	}
	
	public void divideTwoNumbers(int firstnumber, int secondnumber) {
		calculationValue = firstnumber / secondnumber;
	}
	
	public void modulus(int firstnumber, int secondnumber) {
		calculationValue = firstnumber % secondnumber;
	}
	
	public int getCaculationValue() {
		return calculationValue;
	}

}
