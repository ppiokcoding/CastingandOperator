package CastingandOperator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operator {
	
	public static void main(String[] args) throws IOException {
		
		//[Operator]
		
		/*
		 ������, Operator
		 - �ǿ�����(Operator)�� ������� �̸� ������ ������ �� �Ŀ� ������ ����� �����ִ� ���
		 - �ַ� ��ȣ�� ���� ��� + �ܾ ���� ���
		 
		  1. ����(Statement)
		  2. ǥ����(Expression)
		  3. ������
		  4. �ǿ�����
		  5. ������ �켱����
		  6. ������ �������
		 
		  
		  �������� ����
		  1. ��� ������
		  2. �� ������
		  3. �� ������
		  4. ���� ������
		  5. ���� ������
		  6. ���� ������
		  7. ��Ʈ ������(x)
		 
		 */
		
		//����(Statement)
		//int sum = 10 + 20; //����(Statement)
		
		
		//ǥ����
		// - int sum
		// - 10 + 20
		// - sum = 30
		
		//������
		// - =
		// - +
		
		//�ǿ�����
		// - = > sum, 30
		// - + > 10, 20
		
		//int sum = 10 + 20;
		
		
		//1. ��� ������
		// - +, -, *, /, %(mod, ������) --> (5����)
		// - 2�� ������
		// - �ǿ����ڸ� �������� ������. (����, �Ǽ�)
		// - %: ���� ����
		

		//- ����/���� = ����
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b);
		
		
		//������ ������(���!!)
		// - ������ �ǿ����ڰ� 1�� �̻��� �Ǽ��� ���� ����� �Ǽ��̴�.
		System.out.println(10 / 3);     // ����/���� -> 3
		System.out.println(10.0 / 3.0); // �Ǽ�/�Ǽ� -> 3.33333333
		System.out.println(10.0 / 3);   // �Ǽ�/���� -> 3.33333333
		System.out.println(10 / 3.0);   // �Ǽ�/���� -> 3.33333333
		
		//�ٺ� ����(*****)
		// - ��� ��� ������ ��� �ڷ����� �� �ǿ����� �߿��� ũ�Ⱑ �� ū �ڷ������� ��ȯ�� �ȴ�.
		// - '+' : �Ű澲��!!! 
		// - '-' : �Ű澲��!!!
		// - '*' : ���� �Ű澲��!!!
		// - '/' : �Ҽ����ϸ� ������ ��������
		// - '%' : �Ű� x
		
		int c = 1000000000;
		int d = 1000000000;
		int e = 2000000000;
		int f = Integer.MIN_VALUE;
		
		System.out.println(c + d); //int
		System.out.println(c + e); //int + int = int(�����) �ε� 21���� �Ѿ�� �����÷ο��!!!! �̻��� �� ����
		System.out.println(c + (long)e); // int + long = long 
		System.out.println((long)c + e);
		System.out.println((long)c +(long)e);
		System.out.println(1000000000 + 2000000000L);
		System.out.println(f - 1L);
		
		
		//2. �� ������
		//- >, >=, <, <=, ==(equals), !=(not equals)
		//- 2�� ������
		//- �ǿ����ڵ��� ����(����) ���ϴ� ����
		//- �ǿ����ڸ� �������� ������.
		//- ������ ����� boolean�̴�.
		
		a = 10;
		b = 3;
		
		System.out.printf("%d > %d = %b\n", a, b, a > b);
		System.out.printf("%d >= %d = %b\n", a, b, a >= b);
		System.out.printf("%d < %d = %b\n", a, b, a < b);
		System.out.printf("%d <= %d = %b\n", a, b, a <= b);
		System.out.printf("%d == %d = %b\n", a, b, a == b);
		System.out.printf("%d != %d = %b\n", a, b, a != b);
		
		//�䱸����] ���̸� �Է� > ���ϴ� ����? ��ȿ�� �˻�. 19�� �̻�
		int age = 15;
		
		// A > B
		//- ���� -> ������
		//- ��ü -> ��
		//1. A�� B���� ũ��. (O)
		//2. B�� A���� �۴�.
		
		System.out.println(age >= 19); // ���
		System.out.println(19 <= age); // ������
		
		
		//�䱸����] ����� Ű���� �Է� > ���� 1�� > ���� �ҹ������� �Ǵ�?
		//**** ��ȿ�� �˻�, Validation Check
		//		-> ���α׷����� ���� �ִ� ���������� �Ǻ��ϴ� �۾�
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���ҹ��� �Է�: ");
		String input = reader.readLine();
		
		System.out.println("�Էµ� ����: " + input);
		
		//����ڰ� �Է��� ���� 1���� ����ҹ������� Ȯ��? > �����ڵ尪�� ����Ѵ�.
		// 'A' -> (int)'A' -> 65
		// "A" -> (int)"A" // (X) ������(String)�� ����(int)���� ����ȯ�� �Ұ����ϴ�.
		
		// "A" -> 'A' -> 65 // ���ڿ� �� ĳ���ͷ� �ٲٴ� ����� �����ؼ� �ϴ� ��
		char c1 = input.charAt(0); // input("A") -> c1('A') ��, �ѱ����̾�� ��!!
		
        //System.out.println((int)input); //(�Ұ�), "A"
		System.out.println(c1);
		System.out.println((int)c1);
		
		//���� �ҹ���? > �����ڵ尪 > a(97) ~ z(122)
		
		System.out.println((int)c1 >= 97);
		System.out.println((int)c1 <= 122);
		
		System.out.println((int)c1 >= (int)'a');
		System.out.println((int)c1 <= (int)'z');
		
		//char -> ���������δ� ������ -> ���� �� ����(���� �ڵ尪���� �񱳵Ǵ� ����)
		System.out.println(c1 >= 'a');
		System.out.println(c1 <= 'z');
		
		System.out.println('��' > '��');
		System.out.println('$' > '@');

		//System.out.println("A" > "B"); String > String �Ұ���(String�� ���ڰ� �ƴϱ� ����)
		
		//����ڰ� �Է��ϴ� ��� ������ > �ݵ��(***) ��ȿ�� �˻� �ʿ�
		
		
	}//main

}
