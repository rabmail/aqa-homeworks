package ru.netology.domain;


import static org.testng.AssertJUnit.assertEquals;

public class BonusServiceTest {

    @org.testng.annotations.Test
    void shouldReturn10IfAmountIs2000() {

        //подготовка данных
        BonusService service = new BonusService();
        int amount = 2000;

        //выполняемое действие
        int actual = service.remain(amount);

        //ожидаемый результат
        int expected = 0;

        assertEquals( actual, expected);
    }

    @org.testng.annotations.Test
    void shouldReturnZeroIfAmountLowerThan1000() {
        BonusService service = new BonusService();
        int amount = 900;

        int actual = service.remain(amount);

        int expected = 100;

        assertEquals( actual, expected);
    }

}
