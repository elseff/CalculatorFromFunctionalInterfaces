import java.util.Scanner;

public class CalculatorForFunctionalInterfaces {
    public static Operation<Double> getOperation() {
        return switch (new Scanner(System.in).nextLine()) {
            case "*" -> (value1, value2) -> {
                System.out.println("Multiplication");
                return value1 * value2;
            };
            case "/" -> (value1, value2) -> {
                System.out.println("Division");
                return value2 == 0 ? 0 : value1 / value2;
            };
            case "+" -> (value1, value2) -> {
                System.out.println("Additional");
                return value1 + value2;
            };
            case "-" -> (value1, value2) -> {
                System.out.println("Subtraction");
                return value1 - value2;
            };
            default -> (value1, value2) -> {
                System.out.println("It's not operation!");
                return 0.0;
            };
        };
    }
    public static void main(String[] args) {
        System.out.println("First number:");
        Double number1 = Double.valueOf(new Scanner(System.in).nextLine());
        System.out.println("Second number:");
        Double number2 = Double.valueOf(new Scanner(System.in).nextLine());
        while (true) {
            System.out.print("\nYour operation:");
            System.out.println(getOperation().getResult(number1, number2));
        }
    }
}
interface Operation<T> {
    T getResult(T value1, T value2);
}
