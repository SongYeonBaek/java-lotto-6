package lotto;

public class Application {
    public static void main(String[] args) {
        CalculateResult calculateResult = new CalculateResult();
        calculateResult.getUserInput();
        calculateResult.calculate();
        calculateResult.printResult();
    }
}
