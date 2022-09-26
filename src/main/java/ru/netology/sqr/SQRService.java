package ru.netology.sqr;

public class SQRService {
    public int count(int minLimit, int maxLimit) {
        int total = 0;
        int i;
        for (i = 10; i <= 99; i++) {
            if (i * i >= minLimit) {
                if (i * i <= maxLimit) {
                    total++;
                }
            }
        }
        return total;
    }
}