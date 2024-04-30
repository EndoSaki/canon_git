package 課題1;

import java.util.Random;

public class CheckString4 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(3);

		switch (a) {
		case 0:
			System.out.print("グー");
			break;
		case 1:
			System.out.print("チョキ");
			break;
		case 2:
			System.out.print("パー");
		}
	}
}
