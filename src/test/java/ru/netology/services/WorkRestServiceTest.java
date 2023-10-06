package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

//10_000,3_000,20_000
//100_000,60_000,150_000

public class WorkRestServiceTest {
    @ParameterizedTest
    //  @CsvSource({
    //        "10000,3000,20000,3",
    //      "100000,60000,150000,2"

    // } )
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void testRest(int income, int expenses, int threshold, int expected) {
        WorkRestService service = new WorkRestService();

        int actual = service.calcRest(income, expenses, threshold);
        // int expected = 3;
        Assertions.assertEquals(expected, actual);

    }

    //   @Test
    //public void testResttt () {
    //  WorkRestService service = new WorkRestService();
    // int actual = service.calcRest(100_000, 60_000, 150_000);
    // int expected = 2;
    // Assertions.assertEquals(expected, actual);

    // }

}