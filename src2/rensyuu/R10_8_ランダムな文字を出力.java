package rensyuu;

import java.util.Random;

public class R10_8_ランダムな文字を出力 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(3);
		
		switch(a) {
		case 0:
		System.out.println("グー");
		break;
		case 1:
		System.out.println("チョキ");
		break;
		case 2:
		System.out.println("パー");
		break;
		}
		

	}

}
