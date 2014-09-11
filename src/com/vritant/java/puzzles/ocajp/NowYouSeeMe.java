package com.vritant.java.puzzles.ocajp;

class A {
	public int i = 10;
}

class B extends A {
	private int i = 30;
}

class C extends B { }

public class NowYouSeeMe {
	public static void main(String args[]) {
		C c = new C();
		System.out.println(c.i);
	}
}
