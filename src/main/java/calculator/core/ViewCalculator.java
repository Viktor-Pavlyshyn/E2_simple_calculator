package calculator.core;

import static calculator.utils.ResultWriter.writeResultToFile;

public class ViewCalculator {
    private ReadEnteredValueConsole readInput;
    private double firstInput;
    private double secondInput;
    private int action;

    public ViewCalculator(ReadEnteredValueConsole readInput) {
        this.readInput = readInput;
    }

    public void startCalculator() {
        do {
            System.out.println("Please enter your first value: ");
            firstInput = readInput.getEnteredValue();
            System.out.println("Please enter your second value: ");
            secondInput = readInput.getEnteredValue();

            System.out.println("Please enter the number of sign operation number:\n" +
                    "Options: 1.'+', 2.'-', 3.'*', 4.'/'.\n" +
                    "Enter 0. Exit.");

            action = (int) readInput.getEnteredValue();

            printResult(action, new Calculator(firstInput, secondInput));

        } while (action != 0);
    }

    public void printResult(int action, Calculator calculator) {
        String result = "";
        switch (action) {
            case 1:
                result = String.valueOf(calculator.doAddition());
                break;
            case 2:
                result = String.valueOf(calculator.doSubtraction());
                break;
            case 3:
                result = String.valueOf(calculator.doMultiplication());
                break;
            case 4:
                result = String.valueOf(calculator.doDivision());
                break;
            case 0:
                result = "0. Exit.";
                break;
        }
        writeResultToFile("Result: " + result);
        System.out.println("Result: " + result);
    }
}
