package com.platzi.javatests.util;



public class StringUtilTest {

    public static void main(String[] args) {

       asserEquals(StringUtil.repeat("hola", 3), "holaholahola" );

        asserEquals(StringUtil.repeat("hola", 1), "hola");
    }

    private static void asserEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }
}