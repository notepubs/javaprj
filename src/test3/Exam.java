package test3;

import java.util.Scanner;

public class Exam {
	private int kor = 1;
	private int eng;
	private int math;
	
	public Exam() {
		this(0,0,0);
	}	
	public Exam(int kor, int eng, int math) {		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
		
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("kor:");
		this.kor = scan.nextInt();
	}

	public void print() {
		System.out.printf("kor:%d", kor);
	}
	
}
