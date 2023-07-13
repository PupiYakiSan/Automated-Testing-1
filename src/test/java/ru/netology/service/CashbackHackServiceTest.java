package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


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
    public void amountLessBoundary() {

        int amount = 600;

        int expected = 400;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountEqualBoundaryMinusOne() {

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountEqualBoundary() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountEqualBoundaryPlusOne() {

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountMoreBoundary() {

        int amount = 3_550;

        int expected = 450;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountBigMoreBoundary() {

        int amount = 2_556_594;

        int expected = 406;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void minAmountJunitJupiter() {

        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void minAmountPlusOneJunitJupiter() {

        int amount = 2;

        int expected = 998;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountLessBoundaryJunitJupiter() {

        int amount = 600;

        int expected = 400;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountEqualBoundaryMinusOneJunitJupiter() {

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountEqualBoundaryJunitJupiter() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountEqualBoundaryPlusOneJunitJupiter() {

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountMoreBoundaryJunitJupiter() {

        int amount = 3_550;

        int expected = 450;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void amountBigMoreBoundaryJunitJupiter() {

        int amount = 2_556_594;

        int expected = 406;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

}
