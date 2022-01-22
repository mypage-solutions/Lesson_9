package com.mykhaylo;

public class InsertWord {
    public static void main(String[] args) {
        print(insertWord());
    }

    /*
    2) Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99
       со следующими изменениями:
       (!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)
       - если число кратно 3 то вывести вместо него Hello
       - если число кратно 5 то вывести вместо него World
       - если число кратно и 3 и 5 то вывести вместо него HelloWorld
       - иначе вывести просто само число
     */
    public static String insertWord() {
        StringBuilder insertWordOrNumber = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                insertWordOrNumber.append("HelloWorld").append(" ");
            } else if (i % 3 == 0) {
                insertWordOrNumber.append("Hello").append(" ");
            } else if (i % 5 == 0) {
                insertWordOrNumber.append("World").append(" ");
            } else {
                insertWordOrNumber.append(i).append(" ");
            }
        }
        return insertWordOrNumber.toString().trim();
    }

    public static void print(String someText) {
        System.out.println(someText);
    }
}
