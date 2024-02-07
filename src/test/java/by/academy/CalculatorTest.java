package by.academy;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        Assert.assertEquals(4, 2 + 2);

    }

    @Test
    @Ignore
    public void testCalculatorSum() {
        Assert.assertEquals(7, Calculator.sum(5, 2));

    }

    @Test
    @Ignore
    public void testMultiply() {
        Assert.assertEquals(4, 3 * 2);
    }

    @Test
    public void testSameStrings() {
        String a = "abc";
        assertSame("abc", a); // импорт assert
    }

    @Test
    public void testNotSameStrings() {
        String a = new String("abc");
        Assert.assertNotSame("abc", a);
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(true);
    }

    @Test(timeout = 1000)
    public void testTimeout() {
        while (true) {
            break;
        }
    }

    @Test(expected = ArithmeticException.class)
    public void testExpected() {
        int number = 4 / 0;
    }


}

