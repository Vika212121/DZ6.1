package ru.netology.sqr;

public class SQRService {
    public int calculate(int minimumValue, int maximumValue) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minimumValue) {
                if (i * i <= maximumValue) {
                    count++;
                }
            }
        }
        return count;
    }
}