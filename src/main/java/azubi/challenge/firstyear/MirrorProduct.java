package main.java.azubi.challenge.firstyear;

public class MirrorProduct {

    public static void main(String... args) {
        int f1 = 999999999;
        int f2 = 999999999;
        findLargestMirrorProduct(f1, f2);

    }

    public static int findLargestMirrorProduct(int factor1, int factor2) {

        // 1. schleife f1 = factor1 - 1
        for (int f1 = factor1; f1 > 1; f1--) {

            // 2. schleife f2 = factor2 -1

            for (int f2 = factor2; f2 >1; f2--) {

                // product = f1 * f2
                int product = f1 * f2;

                System.out.println(f1 + " * " + f2 + " = " + product);

                // if palindrom(product) is true
                if (PalindromeTester.isPalindrome(product)) {
                    System.out.println("this is a palindrom -->  " + product);
                    return product;
                }
            }

        }

        return 0;
    }
}