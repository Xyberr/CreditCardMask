package org.example;

import java.util.Scanner;

public class CreditCardMask {
    public static void main(String[] args) {

        String inputStr;
        String outStr;
        int UnencryptedNumbers;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, сколько нужно оставить в конце незашиврованных чисел: ");
        UnencryptedNumbers = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите цифры: ");
        inputStr = scanner.nextLine();
        scanner.close();

        StringBuilder sb = new StringBuilder(inputStr);

        /*Сам шифровщик*/
        for (int i = 0; i < inputStr.length() - UnencryptedNumbers; i++){
            sb.setCharAt(i, '#');
        }
        outStr = sb.toString();

        System.out.printf("Ваши зашифрованные данные: %s", outStr);
    }
}