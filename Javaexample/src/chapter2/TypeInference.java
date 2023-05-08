package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 20;	//int i = 20으로 컴파일됨
		var j = 22.0;	//double j = 22.0으로 컴파일됨
		var str = "hello";	//String str = "hello"로 컴파일됨
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3;	str변수는 String으로 먼저 사용되었기 때문에 정수 값을 넣을 수 없음

	}

}
