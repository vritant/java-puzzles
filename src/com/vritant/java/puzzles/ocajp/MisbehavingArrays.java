/*
 * @author vritant
 */
package com.vritant.java.puzzles.ocajp;

public class MisbehavingArrays {
    Integer[] singleDimensionArray = new Integer[3];
    Integer[][] twoDimensionArray = new Integer[3][2];
    twoDimensionArray[0] = singleDimensionArray;
}
