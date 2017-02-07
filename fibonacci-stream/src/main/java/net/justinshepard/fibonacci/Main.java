package net.justinshepard.fibonacci;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Created by justinshepard on 11/21/16.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage:");
            System.out.println("\tfibonacci <x>\t\tPrints the xth number in the Fibonacci sequence.");
            System.exit(1);
        }

        int x = Integer.parseInt(args[0]);
        if (x <= 0) {
            System.out.println("Please enter a number greater than or equal to 1.");
            System.exit(1);
        }

        OptionalInt sequenceNumberAtX = IntStream.generate(new FibonacciSupplier())
                .skip(x - 1)
                .findFirst();

        if (sequenceNumberAtX.isPresent()) {
            System.out.println("The " + x + suffix(x) + " number in the Fibonacci sequence is " + sequenceNumberAtX.getAsInt() + ".");
        }
    }

    private static String suffix(int x) {
        switch (x % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}
