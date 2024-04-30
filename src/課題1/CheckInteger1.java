package 課題1;

import java.util.Scanner;

public class CheckInteger1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("数字を入力して下さい：");

		int num1 = scan.nextInt();

		if (num1 == 7) {
			System.out.print("大当たり!");
		} else {
			System.out.print("ハズレ");
		}

	}

}
