package ru.netology.service;

import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test

    public void shouldSuggestToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expected = service.remain(amount);
        int actual = 200;
        assertEquals(actual, expected);
    }

    @Test

    public void shouldNotSuggestToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = service.remain(amount);
        int actual = 0;
        assertEquals(actual, expected);
    }

    @Test

    public void shouldSuggestToBuyMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1780;
        int expected = service.remain(amount);
        int actual = 220;
        assertEquals(actual, expected);
    }

}