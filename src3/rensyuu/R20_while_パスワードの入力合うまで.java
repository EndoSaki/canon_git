package rensyuu;

import java.util.Scanner;

public class R20_while_パスワードの入力合うまで {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("パスワードを入力してください:");
		String a =scan.next();
		
		while(!a.equals("himitu")){
			System.out.println("再入力してください:");
			a =scan.next();
		}
		
		System.out.println("ログインできました");
		
		
	}	

}
