package rensyuu;

import java.util.Scanner;

public class R10_6_switch {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.print("色を入力してください:");
		String a = scan.next();
		
		switch (a){
		case "red":
		System.out.println("赤です");
		break;
		case "blue":
		System.out.println("青です");
		break;
		case "green":
			System.out.println("緑です");
			break;
		default:
			System.out.println("他の色を入力してください");
		}

	}

}
