package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		char c1 = 'A';
		System.out.println(c1);	//문자 출력
		System.out.println((int)c1);	//문자에 해당하는 정수 값(아스키 코드 값) 출력
		
		char c2 = 66;	//정수 값 대입
		System.out.println(c2);	//정수 값에 해당하는 문자 출력
		
		int ch3 = 67;
		System.out.println(ch3);	//문자 정수 값 출력
		System.out.println((char)ch3);	//정수 값에 해당하는 문자 출력

	}

}
