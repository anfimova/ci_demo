package ru.netology.statistic;

public class StatisticService {

    public int sumSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

}
