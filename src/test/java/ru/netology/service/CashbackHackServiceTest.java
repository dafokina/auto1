package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainNormal() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemainZero() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckOver1000() {
        int actual = service.remain(1800);
        int expected = 200;
        Assert.assertEquals(expected, actual);
    }
}