package main.java.com.Andrew77715.utils.convertors;


public class PrimitiveConverter {
    public char floatToChar(float input) {
        char output = (char) input;
        System.out.println("Input float value is " + input + "\nOutput char value is " + output);
        return output;
    }

    public int charToInt(char input) {
        int output = (int) input;
        System.out.println("Input char value is " + input + "\nOutput int value is " + output);
        return output;
    }

    public char intToChar(int input) {
        char output = (char) input;
        System.out.println("Input int value is " + input + "\nOutput char value is " + output);
        return output;
    }
}