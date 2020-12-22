public class Calculator

{
    public static String errorOperator = "Доступны операции: \nУмножение: *" +
                                "\nСложение: +" +
                                "\nДеление: /" +
                                "\nВычитание: -";

    public void checkingStrings(String[] number) {
        try {
            if (number[0].matches("([1-9]?|10)") && (number[2].matches("([1-9]?|10)"))) {
                int num1 = Integer.parseInt(number[0]);
                int num2 = Integer.parseInt(number[2]);

                if (PaymentSum.payment(num1, num2, number[1]) == 0) {
                    System.out.println(errorOperator);
                } else {
                    System.out.println(PaymentSum.payment(num1, num2, number[1]));
                }
            } else if (number[0].matches("[I,V,X]+") && (number[2].matches("[I,V,X]+"))) {
                ConverterRoman converterRoman = new ConverterRoman();
                converterRoman.converter(number);
                System.out.println(ConverterRoman.getS());
                ConverterRoman.delletS();
            } else {
                throw new IllegalArgumentException("Что то пошло не так");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}