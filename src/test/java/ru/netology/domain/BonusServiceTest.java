package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @Test
    void shouldReturn10IfAmountIs2000() {

        //подготовка данных
        BonusService service = new BonusService();
        int amount = 2000;

        //выполняемое действие
        int actual = service.remain(amount);

        //ожидаемый результат
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnZeroIfAmountLowerThan1000() {
        BonusService service = new BonusService();
        int amount = 900;

        int actual = service.remain(amount);

        int expected = 100;

        assertEquals(expected, actual);
    }
}
