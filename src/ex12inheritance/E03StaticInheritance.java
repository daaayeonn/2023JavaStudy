package ex12inheritance;

class Adder {
	
	public static int val = 0;
	
	public void add(int num) {
		val += num;
		Adder.val += num;
	}
}

class AdderFrriend extends Adder {
	
	public void friendAdd(int num) {
		val += num;
		Adder.val += num;
	}
	
	public void ShowVal() {
		System.out.println("val= " + val);
		System.out.println("val= Adder.val");
	}
}

public class E03StaticInheritance {

	public static void main(String[] args) {

		Adder ad = new Adder();
		AdderFrriend adFriend = new AdderFrriend();
		
		ad.add(1);
		adFriend.friendAdd(3);
		Adder.val += 5;
		AdderFrriend.val += 7;
		
		adFriend.ShowVal();
	}

}
