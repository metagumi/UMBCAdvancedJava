package examples.review;

import java.util.Random;

public class ArrayTests {
    public static void main(String[] args) {
        // Loop through command line arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // Fill n array with random numbers
        // from 0 to 99

        int x [] = new int[10];
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(100);
        }

        // Print contents of array and calculate
        // total of numbrs in the array
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
            total += x[i];
        }
        System.out.println("Total is " + total);

        // Use shorthand to create an array
        String [] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
        }
        System.out.println();
    }

}
