package test1.�Լ�;

import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) {		
		// ������ 
		int[] lotto = new int[6];		
		// ���(�˰���)
		printMenu();
		switch(inputMenu()) {
		case 1:
			inputLottoManual(lotto);
			break;
		case 2:
			genLottoAuto(lotto);
			break;
		case 3:
			exitProgram();
		default:
			errorMessage();
		}
		
	}

	private static void errorMessage() {
		// TODO Auto-generated method stub
		
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		
	}

	private static void genLottoAuto(int[] lotto) {
		// TODO Auto-generated method stub
		
	}

	private static void inputLottoManual(int[] lotto) {
		// TODO Auto-generated method stub
		
	}

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		return menu;
	}

	private static void printMenu() {
		System.out.println("��������������������������");
		System.out.println("��       �ζ� ���� �޴�      ��");
		System.out.println("��������������������������");
		System.out.println();
		System.out.println("\t1. ����");
		System.out.println("\t2. �ڵ�");
		System.out.println("\t3. ����");
		
	}

}
