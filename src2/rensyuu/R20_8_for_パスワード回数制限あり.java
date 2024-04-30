package rensyuu;

import java.util.Scanner;

public class R20_8_for_パスワード回数制限あり {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		
		
		for(int i= 0;i<3;i++) {
			System.out.println("パスワードを入力してください:");
			String a =scan.next();
		if(a.equals("himitu")) {
			System.out.println("ログインできました");
			break;
		}else {
			System.out.println("不正解です");
			
		}
		}
		
		
	}
	

}
