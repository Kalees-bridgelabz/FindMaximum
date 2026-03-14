package com.findmaximum;

import java.util.Scanner;

/**
 * UC5 - internally called from testMaximum
 *
 * Requirements:
     *   (See PDF)
 *
 * @author  Kalees-bridgelabz
 * @version 1.0
 */
public class FindMaximumMain {

    public static void main(String[] args) {
        System.out.println("Welcome to FindMaximum");
        
        System.out.println("\n=== UC5: internally called from testMaximum ===");
        // Find Maximum using Generics / Comparable
        Integer a = 56, b = 30, c = 70;
        Integer max = (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) ? a
                    : (b.compareTo(c) >= 0) ? b : c;
        System.out.println("Max of " + a + ", " + b + ", " + c + " = " + max);
    }
}
