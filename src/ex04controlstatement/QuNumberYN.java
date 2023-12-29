package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN {

	public static void main(String[] args) throws IOException{

		System.out.println("하나의 문자를 입력하세요:");
		int x = System.in.read();
		if (x>=48 || x<=57) {
			System.out.println("숫자입니다.");
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}
	}

}
