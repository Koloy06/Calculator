public class PaymentSum {

    public static int payment(int number, int number2, String operator) {

        switch (operator) {
            case "-":
                return number - number2;
            case "+":
                return number + number2;
            case "*":
                return number * number2;
            case "/":
                return number / number2;
        }
        return 0;
    }
}
