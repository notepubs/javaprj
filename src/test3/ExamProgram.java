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
		
		//exam.init();// �ʱ�ȭ�� ������ �� ����.
		
		
		//Exam.input(exam); // ����(��) �Է�
		//exam.input();
		
		Exam.print(exam); // ����(��) ���
		
	}

	
}
