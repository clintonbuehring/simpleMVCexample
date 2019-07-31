package Calc;

public class CalculatorModel {
	   
    private int calculationValue;    // Value used in model
    private int x5Value;            // Value for my part, ignore, not used
    private int subValue;			// Value for the subtraction part I added
    // simple add function
    public void addTwoNumbers(int firstNumber, int secondNumber) {
        calculationValue = firstNumber + secondNumber;
    }
    // meant to return the value of the added numbers to the Controller
    public int getCalculationValue() {
        return calculationValue;
    }
    // dumb function I was testing, not used, ignore
    public void x5function() {
        x5Value = calculationValue * 5;
    }
    // ignore, returned the value of calculationValue * 5, not used
    public int getx5Value() {
        return x5Value;
    }
    // Just testing to see if text can be sent to Controller
    public String retString() {
        return "Sauce";
    }
    // simple subtraction function I added for the second button
    public void subtractTwoNumbers(int firstNumber, int secondNumber) {
       subValue = firstNumber - secondNumber;
    }
    // meant to return the value of subtracted numbers to controller
    public int getSubValue() {
       return subValue;
    }
 
}
