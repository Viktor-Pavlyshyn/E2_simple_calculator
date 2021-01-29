package calculator.core;

import java.util.Scanner;

public class ReadEnteredValueConsole {

    public double getEnteredValue() {
        Scanner console = new Scanner(System.in);

        while (!console.hasNext("\\d+(\\.\\d+)?")){
            System.out.println("You entered incorrect value. \n" +
                    "Please enter correct value: ");
            console.next();
        }
        return console.nextDouble();
    }
}
