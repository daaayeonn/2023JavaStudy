package ex16exception;

import java.io.IOException;

/*
예외처리방법1
: 예외가 발생된 메서드에서 호출했던 지점으로 예외객체를 던지고, 메인에서도 프로그램 외부로 예외객체를
던진다. 즉 예외를 내부에서 처리하지 않고 무시하겠다는 의미앋. 외부자원 사용 시 기본적으로 발생되는
예외는 이처럼 무시하는 게 가능하다. 이를 "예외던지기"라고 한다.
하지만 대부분의 예외는 반드시 try~catch로 처리해야만 프로그램이 정상적으로 실행된다.
*/
public class Ex03ExceptionCase1 {
	
	static void complieFunc() throws IOException {
		System.out.println("하나의 문자를 입력하세요:");
		int userChr = System.in.read();
		System.out.println("입력한 문자는: " + (char)userChr);
	}

	public static void main(String[] args) throws IOException {
		complieFunc();
	}

}
