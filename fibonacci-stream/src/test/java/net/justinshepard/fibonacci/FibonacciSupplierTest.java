package net.justinshepard.fibonacci;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by justinshepard on 11/21/16.
 */
public class FibonacciSupplierTest {
    @Test
    public void test() {
        FibonacciSupplier iterator = new FibonacciSupplier();
        int fibonacciSequence[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i = 0; i < fibonacciSequence.length; i++) {
            Assert.assertEquals(Integer.toString(i), fibonacciSequence[i], iterator.getAsInt());
        }
    }
}
