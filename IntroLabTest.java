/*
 * This file contains JUnit test cases for IntroLab.java
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10)
    public void test_chopra75() {
        String expected_t = "Hello there!! My name is \"the Professor\"! I like dogs more than cats! Do you have any reservations?";
        String expected_f = "Hello there!! My name is \"the Professor\"! I like cats more than dogs! Deal with it.";
        String actual_t = IntroLab.chopra75(true);
        String actual_f = IntroLab.chopra75(false);
        assertEquals(expected_t, actual_t);
        assertEquals(expected_f, actual_f);
    }
}
