package Calc;

import java.awt.event.ActionListener;

import javax.swing.*;
 
public class CalculatorView extends JFrame{
    // variables from a simple addition app I found online
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
    // I added these to test out how it all works, piggybacked off of calculateButton
    private JLabel x5Label = new JLabel("x 5 = ");
    private JTextField x5Solution = new JTextField(10);
    // I added these to test out adding a new button, which subtracts the 2 user numbers
    private JLabel testLabel = new JLabel("Tester: ");
    private JButton testButton = new JButton("Test!");
    private JTextField testField = new JTextField(15);
 
    CalculatorView(){
       // Simple JPanel giving for this example, I like ours better...
        JPanel calcPanel = new JPanel();
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        // add original elements to the screen, from original example
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        // 2 additional elements I added which piggy back off of calculateButton
        calcPanel.add(x5Label);
        calcPanel.add(x5Solution);
        // Added these elements to add a new button, which subtracts users numbers
        calcPanel.add(testLabel);
        calcPanel.add(testButton);
        calcPanel.add(testField);
       
        this.add(calcPanel);
       
    }
    // Getter for the Controller to get the first number from User
    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }
    // Getter for the Controller to get the second number from User
    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }
    
    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }
    // Setter to place the addition value from the Controller via Model, into the View.  (in calcSolution JTextField)
    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }
    // Not really needed, was just trying different things 
    public int getX5Solution() {
        return Integer.parseInt(x5Solution.getText());
    }
   
/*    public void setX5Solution(int x5Sol) {
        x5Solution.setText(Integer.toString(x5Sol));
    }
    */
    // Setter I used to see if Text information can be placed in JTextField
    public void setX5Solution(String x5) {
        x5Solution.setText(x5);
    }
    // Setter to place the results of the second button I added into the testFiled
    // should basically subtract 1st number from 2nd Number, independently b/c of 2nd button
    public void setTester(int test) {
       testField.setText(Double.toString(test));
    }
    // ActionListener to listen for when calculateButton is selected from UI
    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
    }
    // ActionListener to listen for when testButton is selected from UI
    void addTesterListener(ActionListener listenForTestButton) {
       testButton.addActionListener(listenForTestButton);
    }
    // needed for error message
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
   
}
