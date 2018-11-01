package net.justinshepard.fibonacci;

import java.util.OptionalInt;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Created by justinshepard on 11/21/16.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length == 1 || args.length == 2) {
            if ("lt".equalsIgnoreCase(args[0])) {
                int x = validateInput(args[1]);

                System.out.print("Fibonacci numbers less than " + x + ": ");
                IntStream.generate(new FibonacciSupplier())
                        .filter(value -> value < x)
                        .forEach(System.out::print);

                System.out.println();
            }
            else {
                int x = validateInput(args[0]);

                OptionalInt sequenceNumberAtX = IntStream.generate(new FibonacciSupplier())
                        .skip(x - 1)
                        .findFirst();

                if (sequenceNumberAtX.isPresent()) {
                    System.out.println("The " + x + suffix(x) + " number in the Fibonacci sequence is " + sequenceNumberAtX.getAsInt() + ".");
                }
            }
        }
        else {
            System.out.println("Usage:");
            System.out.println("\tfibonacci <x>\t\tPrints the xth number in the Fibonacci sequence.");
            System.out.println("\tfibonacci lt <x>\tPrints all numbers in the Fibonacci sequence less than x.");
        }
    }

    private static int validateInput(String arg) {
        int x = Integer.parseInt(arg);
        if (x <= 0) {
            System.out.println("Please enter a number greater than or equal to 1.");
            System.exit(1);
        }
        return x;
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
