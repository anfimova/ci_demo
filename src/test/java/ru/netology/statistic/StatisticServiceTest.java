package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    int[] sales = {8, 15, 15, 13, 17, 20, 19, 20, 7, 14, 14, 18};
    StatisticService service = new StatisticService();

    @Test
    void sumSalesTest() {
        assertEquals(180, service.sumSales(sales));
    }

}