package com.vritant.java.puzzles.ocajp;

class Gramps {

	public void perform_work() { }

}

class Papa extends Gramps {

	public void perform_work() { }

}

class TrickyMe extends Papa {

	public void perform_work() { }

	public static void main(String ... args) {

		( (Gramps) this ).perform_work( );

	}

}
