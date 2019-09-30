package game.½´ÆÃ;

import java.awt.Frame;

public class Program {

	public static void main(String[] args) {
				
		Frame frame = new GameFrame();
	}

	private static void printList() {
		for(int i=0; i<100; i++)
			System.out.printf("sub : %d\n", i+1);
	}

}
