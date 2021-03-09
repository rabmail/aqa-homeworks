package ru.netology.domain;


import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void shouldReturn10IfAmountIs2000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);

        int expected = 0;

        assertEquals( actual, expected);
    }

    @org.testng.annotations.Test
    void shouldReturnZeroIfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);

        int expected = 100;

        assertEquals( actual, expected);
    }

}
