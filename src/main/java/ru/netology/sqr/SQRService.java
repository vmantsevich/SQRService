package ru.netology.sqr;

public class SQRService {

    public int calcSQRService (int parmin, int parmax) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int root = i * i;
            if (root >= parmin) {
                if (root <= parmax) {
                   result++;
                }
            }

        }
        return  result;
    }
}
