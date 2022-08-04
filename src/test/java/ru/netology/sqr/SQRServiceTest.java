package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200, 300, 3",
            "100, 9801, 90",
            "101, 9800, 88"
    })
    public void Task(int minimumValue, int maximumValue, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(minimumValue, maximumValue);

        Assertions.assertEquals(expected, actual);

    }
}
