package main.java.azubi.challenge.firstyear;

public class StringCompressor {

    public static String compress(String input) {
        if (input == "") {
            System.out.println("string is equal empty, return ''");
            return input;
        } else {
            System.out.println("string is not empty, return doing compression");
///// ab hier

int compressor = 1; //counter for counting number of occurances

char c1 = input.charAt(0);

//Created an object of a StringBuilder class      

StringBuilder result = new StringBuilder();

for (int i = 1; i < input.length(); i++) {

    if (input.charAt(i) == c1) {
        compressor++;
    } else {
        if (compressor > 1) {
            result.append("" + compressor + c1);
        } else {
            result.append(c1);
        }
        compressor = 1;
        c1 = input.charAt(i);
    }
}
if (compressor > 1) {
    result.append("" + compressor + c1);
} else {
    result.append(c1);
}
System.out.println(result.toString());

            return input;
        }
    }
}