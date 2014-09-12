/*
 * @author vritant
 */
package com.vritant.java.puzzles.ocajp;

class ColorPack {
    int shadeCount = 12;
    static int getShadeCount() {
        return shadeCount;
    }
}
class BadInvestmentBadReturns {
    public static void main(String args[]) {
        ColorPack pack1 = new ColorPack();
        System.out.println(pack1.getShadeCount());
    }
}
