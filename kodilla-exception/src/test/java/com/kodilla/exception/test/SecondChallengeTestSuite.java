package com.kodilla.exception.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    @DisplayName("Throws Exception")
    void testThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(-10, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(-10, 0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(10, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(10, 0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.7, 1.5))
        );
    }

    @Test
    @DisplayName("NOT throw Exception")
    void testNOTThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.7, 0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.7, 10)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.7, -10))
        );
    }
}
