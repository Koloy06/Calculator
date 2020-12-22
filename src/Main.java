import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            String command = scanner.nextLine();
            String[] number = command.split("\\s+");
            calculator.checkingStrings(number);
        }
    }
}
