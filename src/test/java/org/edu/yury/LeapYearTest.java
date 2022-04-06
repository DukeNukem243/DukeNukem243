package org.edu.yury;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class LeapYearTest {

    @Test
    void shouldNotBeLeapYear() {
        boolean result = LeapYear.isLeapYear(1234);
        assertThat(result).isFalse();
    }

    @Test
    void shouldBeLeapYear() {
        boolean result = LeapYear.isLeapYear(2000);
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 1996})
    void leapYearMultipleCases(int leapYear) {
        boolean result = LeapYear.isLeapYear(leapYear);
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1000, 3000})
    void notLeapYearMultipleCases(int leapYear) {
        boolean result = LeapYear.isLeapYear(leapYear);
        assertThat(result).isFalse();
    }
}