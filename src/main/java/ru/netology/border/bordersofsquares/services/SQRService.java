package ru.netology.border.bordersofsquares.services;

public class SQRService {

    public int calcSQR (int boundlow, int boundhigh) {
        int counter = 0;
        for (int i = 10; i < 99; i++) {
            if ((i * i) >= boundlow && (i * i) <= boundhigh) {
                counter++;
            }
        }
        return counter;
    }
}