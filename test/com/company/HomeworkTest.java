package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    @Test
    void hw10() {
        assertEquals(11, Main.hw10(11, 1089));
        assertEquals(5, Main.hw10(5, 45));
        assertEquals(7, Main.hw10(56, 49));
    }

    @Test
    void hw9() {
        assertEquals(0, Main.hw9(0));
        assertEquals(40, Main.hw9(100)); //seems to be correct based on desmos graph, idk how to do derivates 'n stuf
    }

    @Test
    void hw8() {
        assertEquals(27, Main.hw81(3));
        assertEquals(3*3*3*3*3, Main.hw81(5));

        assertEquals(8*8*8, Main.hw82(3, 8));
        assertEquals(1, Main.hw82(1203, 1));
    }

    @Test
    void hw7() {
        assertEquals(28, Main.hw7()); //value obtained from GDC
    }

    @Test
    void hw6() {
        assertEquals(3, Main.hw6(2));
        assertEquals(7, Main.hw6(4));
        assertEquals(27, Main.hw6(11));
    }

    @Test
    void hw5() {
        assertEquals(1, Main.hw51(100, 50));
        assertEquals(1, Main.hw51(150, 0));
        assertEquals(0, Main.hw51(50, 151));

        assertEquals(1, Main.hw52(1, 151));
        assertEquals(1, Main.hw52(-10, 151));
        assertEquals(0, Main.hw52(100, 151));
    }

    @Test
    void hw4() {
        assertEquals("hit", Main.hw4(0));
        assertEquals("stay", Main.hw4(17));
        assertEquals("stay", Main.hw4(21));
        assertEquals("bust", Main.hw4(22));
    }

    @Test
    void hw2() {
        assertEquals(16, Main.hw2(2, 2));
        assertEquals(9, Main.hw2(5, 4));
    }
}