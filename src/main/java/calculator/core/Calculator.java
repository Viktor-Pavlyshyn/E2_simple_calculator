package calculator.core;

public class Calculator {
    private double firstInput;
    private double secondInput;

    public Calculator() {
        this.firstInput = 0;
        this.secondInput = 0;
    }

    public Calculator(double firstInput, double secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    public double doAddition (){
        return firstInput + secondInput;
    }

    public double doSubtraction (){
        return firstInput - secondInput;
    }

    public double doMultiplication (){
        return firstInput * secondInput;
    }

    public double doDivision (){
        return firstInput / secondInput;
    }
}
