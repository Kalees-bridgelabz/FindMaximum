package com.findmaximum;

import java.util.Scanner;

/**
 * UC1 - method to test the maximum number
 *
 * Requirements:
     *   - Given Max Number at
     *   - 1st Position return the
     *   - Same Number
     *   - TC 1.1
     *   - Ensure the test data has Max Number in
 *
 * @author  Kalees-bridgelabz
 * @version 1.0
 */
public class FindMaximumMain {

    public static void main(String[] args) {
        System.out.println("Welcome to FindMaximum");
        
        System.out.println("\n=== UC1: method to test the maximum number ===");
        // Find Maximum using Generics / Comparable
        Integer a = 56, b = 30, c = 70;
        Integer max = (a.compareTo(b) >= 0 && a.compareTo(c) >= 0) ? a
                    : (b.compareTo(c) >= 0) ? b : c;
        System.out.println("Max of " + a + ", " + b + ", " + c + " = " + max);
    }
}
