package net.justinshepard.fibonacci;


import java.util.function.IntSupplier;

/**
 * Created by justinshepard on 11/21/16.
 */
public class FibonacciSupplier implements IntSupplier {
    private int currentValue = 0;
    private int step = 1;

    @Override
    public int getAsInt() {
        int returnInt = currentValue;
        currentValue = currentValue + step;
        step = returnInt;

        return returnInt;
    }
}
