package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void countSquareValue() {
        SQRService run = new SQRService();
        int lowLim=200;
        int upLim=300;
        int expected=3;
        int actual = run.countSquareValue(lowLim,upLim);
        assertEquals(expected,actual);
    }

}