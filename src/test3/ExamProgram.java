package test3;

import java.util.Scanner;

public class ExamProgram {
	private Exam exam = new Exam();
	static int kor=3;
	
	public void aa() {
		exam.print();
	}

	public static void main(String[] args) {				
				
		Exam exam = new Exam();
		
		//exam.init();// 초기화를 강제할 수 없음.
		
		
		//Exam.input(exam); // 성적(을) 입력
		//exam.input();
		
		Exam.print(exam); // 성적(을) 출력
		
	}

	
}
