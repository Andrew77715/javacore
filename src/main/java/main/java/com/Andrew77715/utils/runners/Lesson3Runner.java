package main.java.com.Andrew77715.utils.runners;
import main.java.com.Andrew77715.utils.convertors.PrimitiveConverter;

public class Lesson3Runner {
    public static void main (String args[]){
        PrimitiveConverter convertor = new PrimitiveConverter();
        convertor.charToInt('q');
        convertor.floatToChar('2');
        convertor.intToChar('e');
    }
}