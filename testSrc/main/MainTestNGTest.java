package main;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MainTestNGTest extends Assert {
    public void test_two_plus_two() {
        final int sum = 2 + 2;
        assertEquals(sum, 4);
    }
}
