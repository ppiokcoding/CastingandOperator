package CastingandOperator;

public class Casting {
	
	public static void main(String[] args) {
		
		//[Casting]
		
		/*
		형변환(x)
		- 참조형 값형간에는 변환이 불가능하다.(*******) > 절대적 > 물리구조
		- String <-> int
		- "100" -> 100
		- Integer.parseInt("100") -> 형변환(절반 맞음, 그래도 적합하지는 않음)
		
		 (자료)형변환, (Data)Type Casting
		 - int -> double
		 - float -> short
		 
		 1. 암시적 형변환, 자동 타입 변환
		 - 큰형 = 작은형;
		 - 100% 안전
		 - short = byte; 	// 2칸 = 1칸;
		 - int = byte; 		// 4칸 = 1칸;
		 - long = byte; 	// 8칸 = 1칸;
		 - long = short; 	// 8칸 = 2칸;
		 
		 2. 명시적 형변환
		 - 작은형 = 큰형;
		 - 경우에 따라 다르다. (작은형이 소화할 수 있는 범위의 원본값이면 가능. 근데 벗어나면 불가능 하다.)
		  		 > 개발자가 직접 처리 (컴파일러나 실행기는 이 문제를 인식하지 못한다.) > 논리 에러
		 */
		// '=' 연산자
		// - 피연산자 2개 > 2항 연산자
		// - 대입 연산자, 할당 연산자
		// - 변수 = 값(상수(리터럴), 변수);
		// - int n = 10;
		// - int m = n; // 변수끼리 복사
		// - LValue = RValue
		// - LValue: 변수
		// - Rvalue: 리터럴, 변수, 메소드 반환값(reader.readLine())
		/* - LValue의 자료형과 RValue의 자료형은 반드시(100%) 동일해야 한다. > 이 규칙을
		만족하지 못하면 연산자는 오류를 발생시키다. (복사x)*****      */
		
		
		byte b1 = 10;	//1byte 1칸. 원본
		short s1;		//2칸, 복사본
		
		//복사
		// short = byte --> 에러 발생!! --> 에러 미발생?
		//컴파일 > s1 = (short)b1;
		  
		//(자료형): 형변환 연산자
		// 	-> 우측의 값(변수, 상수)의 자료형을 괄호안의 자료형으로 변환시키는 작업

		// s1 = b1; //short = byte -> Error
		// s1 = (short)b1;
		// s1 = (short)10; //10(byte)
		// s1 = 10; //10(short) -> short = short -> Execute...

		// 암시적인 형변환, Implicit Type Casting
		// - 개발자 모르게 형변환이 발생했기 때문에
		s1 = b1; // short = byte
		// s1 = (short)b1; //short = short 이 두줄은 같은 코드임
		s1 = (short) b1;
		 
System.out.println("s1: " + s1); //복사본만 확인하면 된다!!
		
		
		
		//******* 1000복사 -> -24(???)
		//******* 컴파일 에러(x), 런타임 에러(x), 값이 이상(?????)
		short s2 = 1000;  //2칸. 원본
		byte b2;		//1칸. 복사본
		
		//복사
		//1칸 = 2칸
		//byte = short
		b2 = (byte)s2;
		
		System.out.println("b2: " + b2);
		
		
		//은행 계좌 프로그램
		//'ㄱ'은행
		int money = 2100000000; //4바이트
		
		//계좌 이체 -> 'ㄴ'은행 계좌
		short copy; //2바이트
		
		//작은형 = 큰형
		copy = (short)money; //계좌 이체 완료
		
		System.out.println("잠실 계좌 잔액: " + copy);  //ㅋ 29952원만 들어오는 사태 발생
		
		
		//------------------------------------------------------------
		//자료형이 다른 값들을 복사할 때
		//1. 암시적 형변환 > 상관없음
		//2. 명시적 형변환 > 항상 주의!
		
		//명시적 형변환때 발생하는 넘치는 현상 > 오버플로우(Overflow)
		//1. 위로 넘치는 현상 > Overflow(오버플로우)
		//2. 아래로 넘치는 현상 > Underflow(언더플로우)
		//3. 1 + 2 > Overflow(오버플로우)
		//-> 오버플로우 발생 > 에러!!!! (값이 손상)
		
		//- LValue의 자료형과 RValue의 자료형은 반드시(100%) 동일해야 한다. 
		//		> 이 규칙을 만족하지 못하면 연산자는 오류를 발생시킨다.(복사X)
		//예외 상황 : byte와 short변수에 상수를 할당할때는 예외로 암시적 형변환을 지원한다.
		
		//byte = int
		//작은형(1) = 큰형(4) > 명시적 형변환
		//byte m1 = (byte)10;
		byte   m1 = 10;
		
		//short = int
		//작은형(2) = 큰형(4) > 명시적 형변환
		//short m2 = (short)10;
		short  m2 = 10;
		
		//int = int
		int    m3 = 10;
		
		//long = int
		//큰형(8) = 작은형(4) > 암시적 형변환
		long   m4 = 10;
		
		
		//실수형 리터럴 > double 형 이다.
		
		//float = double
		//작은형(4) = 큰형(8)
		float f1  = (float)3.14;
		float f2 = 3.14F;
		
		//double = double
		double d1 = 3.14;
		
		
		
		//*** 실수형과 정수형끼리의 형변환
		int n1 = 1000;  //원본(4바이트)
		float k1;		//복사본(4바이트)
		
		
		//암시적 형변환
		//float = int
		k1 = n1;
		
		System.out.println("k1: " + k1);
		
		
		int n2;			  //복사본
		float k2 = 1000;  //원본
		
		//명시적 형변환
		//int = float
		//4바이트 = 4바이트
		//작은형 = 큰형
		n2 = (int)k2;
		
		System.out.println("n2: " + n2);
		
		//int > flaot (x)
		//int < float (o)
		//int = flaot (x)
		//int 범위 : -21억 ~ 21억
		//float 범위 : -무한대 ~ 무한대 
	
		
		//long(8바이트)  vs  float(4바이트)
		//            <<<<<<< 크다

		//정리(****암기)
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//- 모든 정수는 모든 실수보다 크기가 작다.
		//- 형변환 할 때 조심!!!
		
		
		//char, boolean - 형변환
		//char > 겉보기엔 문자, 내부는 숫자 > 형변환의 대상이 된다.
		char c1 = 'A';  //2byte
		short r1; //2byte
		
		//short(2) = char(2)
		r1 = (short)c1; //형변환 성공
		
		System.out.println("r1: " + r1);
		
		System.out.println("==============================");
		
		char c2;
		short r2 = 97;
		
		//char(2) = short(2)
		c2 = (char)r2;
		
		System.out.println("c2: " + c2);
		
		
		
		//char를 문자코드값을 얻기 위해서 정수로 형변환을 해야 된다면
		// -> 반드시 int, long을 사용해야한다.(long 과유불급 -> int 권장)
		
		//가(44032)
		System.out.println((int)'가');
		System.out.println((short)'가');
		
		//A(65)
		System.out.println((int)'A');
		System.out.println((short)'A');
		
		
		//자바에서는 boolean은 형변환의 대상이 되지 못한다.
		
		
		//***결론
		// -> "값형끼리의 형변환" -> "숫자형끼리의 형변환"
		// - byte, short, int(*), long(*), float, double(*), char(*)간의 형변환이 가능하다.
		 
		 
		
	}//main
	
}
