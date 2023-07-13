package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void minAmount() {

        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minAmountPlusOne() {

        int amount = 2;

        int expected = 998;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AmountLessBoundary() {

        int amount = 600;

        int expected = 400;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AmountEqualBoundaryMinusOne() {

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AmountEqualBoundary() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AmountEqualBoundaryPlusOne() {

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AmountMoreBoundary() {

        int amount = 3_550;

        int expected = 450;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void AmountBigMoreBoundary() {

        int amount = 2_556_594;

        int expected = 406;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

}
