package �����迭;

import java.util.Scanner;

import test3.Exam;

public class Program {

	public static void main(String[] args) {
		
		//ObjectList list = new ObjectList();
		GList<Exam> list = new GList();
		// ��� ���� ��� ����? ������ �� �ִ�.
		list.add("hello");
		list.add(30);
		list.add(new Exam());
		
		// ���� �Լ��� ����Ϸ���? ������ ��ȯ�ؾ� �Ѵ�.
		list.get(2).input();
		//((Exam)list.get(2)).input();
		//((Exam)list.get(2)).print();
		
		
		//ObjectList list = new ObjectList();
		//Object[] data = new Object[3];
		//int index = 0;
		
		//int exit = 0;
		
		//Scanner scan = new Scanner(System.in);
		
		//do {
			//input(data/*��������*/, index/*������*/);
		//	input(list);	
			//print(data, index);
		//	print(list);
		//	System.out.print("go?(1 or 0):");
		//	exit = scan.nextInt();
		//}while(exit != 1);
	}

	private static void input(ObjectList list/* Object[] data, int index */) {
		Scanner scan = new Scanner(System.in);
		System.out.print("kor:");
		
		list.add(scan.nextInt());
		//data[index] = scan.nextInt();
		//index++;// ���� ���� ������ ��ġ == �Էµ� ���� ����
	}

	private static void print(ObjectList list) {
		for(int i=0; i<list.size(); i++)
			System.out.printf("kor:%d, ", list.get(i) /* data[i] */);
	}


}
