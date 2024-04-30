package rensyuu;

import java.util.Scanner;

public class R10_3_Scan {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.print("年齢を入力してください:");
		int a = scan.nextInt();
		
		if(a<0 || 130<a) {
			System.out.println("0～130で入力してください");
		}else  {
			System.out.println("正しいです");
		}

	}

}
