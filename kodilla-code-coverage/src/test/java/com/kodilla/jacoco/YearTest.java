package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        Year year = new Year(1600);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldReturnFalseIfNotDivisibleBy400() {
        Year year = new Year(100);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4() {
        Year year = new Year(8);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy400() {
        Year year = new Year(1601);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }
}