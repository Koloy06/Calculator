public class ConverterRoman {
    int num1, num2;
    private static StringBuilder s = new StringBuilder("");
    public static String error = "Введите в соответствии с примером в кавычках: \n" +
            "Только Арабские цифры \"2 + 3\". Цифры от 1 до 10 \n" +
            "Только Римские цифры \"V * II\". Цифры от I до X \n";

    public void converter(String[] number) {
        num1 = ConverterArab.converterString(number[0]);
        num2 = ConverterArab.converterString(number[2]);
        int romanSum = PaymentSum.payment(num1, num2, number[1]);
        if (num1 > 0 && num2 > 0) {
            while (romanSum >= 100) {
                s.append("C");
                romanSum -= 100;
            }
            while (romanSum >= 90) {
                s.append("XC");
                romanSum -= 90;
            }
            while (romanSum >= 50) {
                s.append("L");
                romanSum -= 50;
            }
            while (romanSum >= 40) {
                s.append("XL");
                romanSum -= 40;
            }
            while (romanSum >= 10) {
                s.append("X");
                romanSum -= 10;
            }
            while (romanSum >= 9) {
                s.append("IX");
                romanSum -= 9;
            }
            while (romanSum >= 5) {
                s.append("V");
                romanSum -= 5;
            }
            while (romanSum >= 4) {
                s.append("IV");
                romanSum -= 4;
            }
            while (romanSum >= 1) {
                s.append("I");
                romanSum -= 1;
            }
        } else {
            System.out.println(error);
        }
    }

    public static StringBuilder getS() {
        return s;
    }

    public static void delletS() {
        ConverterRoman.s.delete(0, s.length());
    }

    public static String getError() {
        return error;
    }
}
