package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "100, 9801, 90",
            "4900, 4901, 1",
            "1, 99, 0",
            "9801, 9999, 1",
            "400, 401, 1",
            "9801, 100, 0",
            "200, 300, 3"
    })
    public void shouldCalculate(int minLimit, int maxLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.count(minLimit, maxLimit);


        Assertions.assertEquals(expected, actual);
    }


}