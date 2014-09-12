/*
 * @author vritant
 */
package com.vritant.java.puzzles.ocajp;

public class SwitchCase {
    public static void main(String ... args) {
        int a=0,b=3;
        final int c=4,d=5;
        final int e;
        e=9;
        switch(d) {
        case c: break;
        case a: break;
        case d: break;
        case e: break;
        //case 1.2: break;
        default: break;
        }

        switch("asd") {
        case "asd": break;
        case null: break;
        }
    }
}
