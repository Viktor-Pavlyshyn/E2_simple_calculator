import calculator.core.ReadEnteredValueConsole;
import calculator.core.ViewCalculator;

public class Application {
    public static void main(String[] args) {
        new ViewCalculator(new ReadEnteredValueConsole()).startCalculator();
    }
}
