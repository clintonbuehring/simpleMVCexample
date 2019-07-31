package Calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class CalculatorController {
	// set up the view and model so the Controller can talk to each
    private CalculatorView theView;
    private CalculatorModel theModel;
    // allows the Controller to talk to both View & Model as well as Listeners
    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener());
        this.theView.addTesterListener(new subCalListener());
    }
   
    // The original Calculate listener, for the first button which adds 1st & 2nd Number
    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber, x5Number = 0;
            try {
                firstNumber = theView.getFirstNumber();		// Get the numbers from View
                secondNumber = theView.getSecondNumber();	//   to be used in this class & sent to Model
           
                theModel.addTwoNumbers(firstNumber, secondNumber);	// uses add function in Model
           
                theModel.x5function();		// just a dumb function I was testing with in Model, ignore
           
                theView.setCalcSolution(theModel.getCalculationValue());	// Gets the add results from Model, sends it to View
           
                //theView.setX5Solution(theModel.getx5Value());		// ignore
                theView.setX5Solution(theModel.retString());		// I just used this to try and return text to View
            } catch(NumberFormatException ex) {
           
                System.out.println(ex);
           
                theView.displayErrorMessage("You need to enter 2 ints");
            }
        }
    }
   
    class subCalListener implements ActionListener{
       public void actionPerformed(ActionEvent e) {
              int firstNumber, secondNumber = 0;
              try {
                firstNumber = theView.getFirstNumber();		// Get the numbers from View again
                secondNumber = theView.getSecondNumber();
                   
                theModel.subtractTwoNumbers(firstNumber, secondNumber);	// uses subtract function in Model
               
                theView.setTester(theModel.getSubValue());	// gets the Subtraction results from Model, sends it to View
              } catch(NumberFormatException ex) {
                    System.out.println(ex);
                   
                    theView.displayErrorMessage("You didn't enter 2 ints fool!");
              }
       }
    }
 
}
