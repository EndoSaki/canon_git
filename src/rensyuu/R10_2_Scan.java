package rensyuu;

import java.util.Scanner;

public class R10_2_Scan {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.print("xの値を入力してください:");
		int a = scan.nextInt();
		System.out.print("yの値を入力してください:");
		int b = scan.nextInt();
		if(a<b) {
			System.out.println("xはyより小さいです");
		}else if(a>b) {
			System.out.println("xはyより大きいです");
		}

	}

}
