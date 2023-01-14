package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testWhenFindSquareRoot() {
        SQRService service = new SQRService();

        int actual = service.calcSQRService(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testWhenNotFindSquareRoot(){
        SQRService service =  new SQRService();

        int actual = service.calcSQRService(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testWhenFindOneSquareRoot(){
        SQRService service =  new SQRService();

        int actual = service.calcSQRService(200, 225);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }
}