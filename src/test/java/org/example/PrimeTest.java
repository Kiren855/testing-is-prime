package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class PrimeTest {
    @Test
    public void testIsPrime() {
        assertTrue(Prime.isPrime(2), "2 là số nguyên tố");
        assertTrue(Prime.isPrime(3), "3 là số nguyên tố");
        assertTrue(Prime.isPrime(5), "5 là số nguyên tố");

        assertTrue(Prime.isPrime(5), "5 là số nguyên tố");
        assertTrue(Prime.isPrime(51), "51 là số nguyên tố");
        assertTrue(Prime.isPrime(53), "53 là số nguyên tố");

    }

    @Test
    public void TestIsNotPrime(){
        assertFalse(Prime.isPrime(1), "1 không phải là số nguyên tố");
        assertFalse(Prime.isPrime(4), "4 không phải là số nguyên tố");

        assertFalse(Prime.isPrime(10), "10 không phải là số nguyên tố");
        assertFalse(Prime.isPrime(12), "12 không phải là số nguyên tố");

        assertFalse(Prime.isPrime(-5), "-5 không phải là số nguyên tố");
        assertFalse(Prime.isPrime(0), "0 không phải là số nguyên tố");
    }
}
