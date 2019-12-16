package main.java.azubi.challenge.firstyear;

public class SumPair {

    public static boolean sumPairExists(int sum, int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    return true;
                }
            }

        }
        return false;
    }

}