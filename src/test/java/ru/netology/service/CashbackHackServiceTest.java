package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test

public void shouldSuggestToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = service.remain(amount);
        int actual = 100;
        assertEquals(actual,expected);
    }
    @Test

    public void shouldNotSuggestToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = service.remain(amount);
        int actual = 0;
        assertEquals(actual,expected);
    }
    @Test

    public void shouldSuggestToBuyMoreThanThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1670;
        int expected = service.remain(amount);
        int actual = 330;
        assertEquals(actual,expected);
    }


}