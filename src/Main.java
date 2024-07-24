import operations.StringUtils;
import operationsPhoneBook.PhoneBook;


public class Main {
    public static void main(String[] args) {
        String[] words = {
                "Пирог", "Слизь", "Пес", "Дом", "Страус", "Пирог",
                "Слизь", "Пирог", "Дом", "Мышь", "Мышь", "Страус",
                "Пес", "Дом", "Пирог", "Телефон", "Пес", "Страус",
        };

        System.out.println("\nПервое задание: ");
        StringUtils stringUtils = new StringUtils();
        System.out.println("Повторение слов : \n" + stringUtils.getWordCount(words));
        System.out.println("\nСлова в массиве : \n" + stringUtils.getUniqueWords(words));
        System.out.println("\nВторое задание: ");
        PhoneBook phoneDirectory = new PhoneBook();
        phoneDirectory.addSub("Саша", "+375447601112");
        phoneDirectory.addSub("Саша", "+375254172093");
        phoneDirectory.addSub("Катя", "+88005553535");
        System.out.println("Все номера Кирилла: " + phoneDirectory.getSub("Кирилл"));
        System.out.println("Все номера Саши: " + phoneDirectory.getSub("Саша"));
        System.out.println("Все номера Кати: " + phoneDirectory.getSub("Катя"));
    }
}