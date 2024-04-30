package rensyuu;

import java.util.Scanner;

public class R10_1_Scan {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("数字を入力してください:");
		int a = scan.nextInt();
		if(a== 7) {
			System.out.println("大当たり");
		}else {
			System.out.println("ハズレ");
		}

	}

}
