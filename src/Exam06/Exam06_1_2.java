package Exam06;

public class Exam06_1_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info()); // 3이 출력된다.
		System.out.println(card2.info()); // 1K가 출력된다.
		}
		}
		class SutdaCard {
		int num;
		boolean isKwang;
		SutdaCard() {
		this(1, true); // SutdaCard(1, true)를 호출한다.
		}
		SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
		}
		String info() { // 숫자를 문자열로 반환한다. 광(光)인 경우 K를 덧붙인다.
		return num + ( isKwang? "K" : "");
		}
		}
	

