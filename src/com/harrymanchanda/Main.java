package com.harrymanchanda;

public class Main {
    public static void main(String[] args) {
        // width of 8 bits <==> 1 Byte
        byte myMinByteValue = -128; // - 2**7
        byte myMaxByteValue = +127; // + 2**7 - 1

        // width of 16 bits <==> 2 Bytes
        short myMinShortValue = -32_678; // - 2**15
        short myMaxShortValue = +32_677; // + 2**15 - 1

        // width of 32 bits <==> 4 Bytes
        int myMinIntValue = -2_147_483_648; // - 2**31
        int myMaxIntValue = +2_147_483_647; // + 2**31 - 1

        // width of 64 bits <==> 8 Bytes
        long myMinLongValue = -9_223_372_036_854_775_808L; // - 2**63
        long myMaxLongValue = +9_223_372_036_854_775_807L; // + 2**63 - 1

        // width of 32 bits <==> 4 Bytes
        float myFloatValue = 5.25F;

        // width of 64 bits <==> 8 Bytes
        double myDoubleValue = 5.25D;
    }
}
