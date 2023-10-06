package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//10_000,3_000,20_000
//100_000,60_000,150_000

public class WorkRestServiceTest {
    @Test
        public void testRest () {
        WorkRestService service = new WorkRestService();
        int actual = service.calcRest(10_000, 3_000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

    @Test
        public void testResttt () {
            WorkRestService service = new WorkRestService();
            int actual = service.calcRest(100_000, 60_000, 150_000);
            int expected = 2;
            Assertions.assertEquals(expected, actual);

        }

}