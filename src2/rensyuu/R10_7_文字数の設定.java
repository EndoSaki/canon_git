package rensyuu;

import java.util.Scanner;

public class R10_7_文字数の設定 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.print("名前：");
		String a = scan.next();
		int b =a.length();
		
		if(b>20){
			System.out.println("20字以内で入力してください");
		}else {
			System.out.println("ようこそ"+a+"さん");
		}
		

	}

}
