package com.vritant.java.puzzles.ocajp;

public class PrimitiveMethods {
	static int overloadedMethod(short lilliput) {
		return 3;
	}

	static int overloadedMethod(short ... lilliput) {
		return 5;
	}

	static int justAMethod(Double d) {
		return 9;
	}

	public static void main(String ... args) {
		overloadedMethod(3);
		justAMethod(4.0f);
	}
}
