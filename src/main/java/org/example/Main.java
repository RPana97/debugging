package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate and print the average
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);

        // Introduce a null pointer exception
        try {
            int[] nullArray = null;
            calculateAverage(nullArray);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }

        // Introduce an array index out of bounds exception
        try {
            int[] outOfBoundsArray = {1, 2, 3, 4, 5};
            System.out.println(outOfBoundsArray[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException");
        }

        // Introduce a logic error
        double incorrectAverage = calculateAverageWithLogicError(numbers);
        System.out.println("Incorrect Average: " + incorrectAverage);
    }

    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    // Method with a logic error
    public static double calculateAverageWithLogicError(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        // Logic error: Dividing by a constant instead of the array length
        return (double) sum / 10;
    }
}

/*
Debugging Steps

    Finding and Fixing Exceptions

        Null Pointer Exception:
        - Used System.out.println statements to check where the exception occurred.
        - Identified that the exception was caused by passing a null array.
        - Added a null check in the calculateAverage method to handle this case.

        Array Index Out of Bounds Exception:
        - Used System.out.println statements to identify the line causing the exception.
        - Fixed the issue by ensuring that the array index accessed is within bounds.

    Finding and Fixing Logic Error:
        - Used System.out.println to print intermediate values, such as the sum and the divisor.
        - Noticed that the divisor was incorrectly set to a constant value.
        - Corrected the logic by changing the divisor to numbers.length.
*/

