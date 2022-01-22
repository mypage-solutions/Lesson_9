package com.mykhaylo;

public class FindSum {
    public static void main(String[] args) {
        print(findSum(100.0, 2));
    }

    /*
    1) В банк положили s денег. Какой станет сумма вклада через n лет, если процент 1,5% добавляется
       к сумме вклада ежемесячно. (сложный процент)
       Написать метод который принимает 2 параметра - s, n и возвращает сумму денег на счету.
     */
    public static double findSum(double s, int n) {
        int months = n * 12;
        for (int i = 0; i < months; i++) {
            s += s * 0.015;
        }
        return s;
    }

    public static void print(double value) {
        System.out.printf("%.2f", value);
    }
}
