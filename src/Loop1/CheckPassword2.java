package Loop1;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("パスワードを入力して下さい：");
		String moji = scan.next();
		
		while(!moji.equals("himitu")) {
		System.out.print("再入力してください:");
		moji = scan.next();
		}
		if(moji.equals("himitu")) {
		System.out.println("ログインできました");
	}
	}

}
