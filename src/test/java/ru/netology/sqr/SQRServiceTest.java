package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

        @ParameterizedTest
        @CsvSource({
                "200,300,3",
                "201,299,3",
                "1,0,0",
                "300,400,3"

        })

        public void test (int limitMin, int limitMax, int expected) {
            SQRService service = new SQRService();
            int actual = service.numberOfSquaers(limitMin, limitMax);

            Assertions.assertEquals(expected, actual);
        }
    }

