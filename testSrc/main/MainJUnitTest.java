package main;

import junit.framework.TestCase;

public class MainJUnitTest extends TestCase {
    public void test_two_plus_two() {
        final int sum = 2 + 2;
        assertEquals(4, sum);
    }
}
