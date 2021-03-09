package ru.netology.domain;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturn10IfAmountIs2000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);

        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnZeroIfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);

        int expected = 100;

        assertEquals( expected, actual);
    }
}
